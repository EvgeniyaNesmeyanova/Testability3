public class CreditPaymentService {
    public int calculate(int amount, int loanPeriodY, double interestRate) {

        double mir = interestRate / 12 / 100; //расчет месячной процентной ставки
        int nop = loanPeriodY * 12; //количество платежей
        double annuityRate = mir * Math.pow(1 + mir, nop) / (Math.pow(1 + mir, nop) - 1); //расчет коэффициента аннуитета
        double annuityPayment = amount * annuityRate; //расчет ежемесячного платежа

        return (int) annuityPayment;
    }
}
