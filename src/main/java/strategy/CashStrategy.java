package strategy;

public class CashStrategy implements IPaymentStrategy{
    double bonus = -0.02;

    @Override
    public void pay(double amount) {
        System.out.println("Payment by cash. \nBonus: " + amount * bonus);
        System.out.println("Total payment: " + (amount + amount * bonus));
    }
}
