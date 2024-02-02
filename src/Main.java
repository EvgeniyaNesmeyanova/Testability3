//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int annuityPayment1 = service.calculate(1000000, 1, 9.99); // расчет ежемесячного платежа
        System.out.println(annuityPayment1); //вывод на экран рассчитанного ежемесячного платежа

        int annuityPayment2 = service.calculate(1000000, 2, 9.99); // расчет ежемесячного платежа
        System.out.println(annuityPayment2); //вывод на экран рассчитанного ежемесячного платежа

        int annuityPayment3 = service.calculate(1000000, 3, 9.99); // расчет ежемесячного платежа
        System.out.println(annuityPayment3); //вывод на экран рассчитанного ежемесячного платежа
    }
}