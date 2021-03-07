package strategy;

public class DiscountStrategy implements IPaymentStrategy{
    private int discount;

    public DiscountStrategy(int discount) {
        this.discount = discount;
    }

    @Override
    public void pay(int amount) {
        if (amount > 100) {
            System.out.println("You have discount: " + (double) (amount / discount));
        }
    }
}
