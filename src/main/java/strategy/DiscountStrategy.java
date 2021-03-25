package strategy;

import java.util.List;

public class DiscountStrategy implements ICalculateStrategy {
    private double discount;

    public DiscountStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculateTotal(List<Item> cart) {
        double sum = calculateSum(cart);
        double discountAmount = 0;

        if (sum > 100) {
            discountAmount = sum * discount / 100.0;
            System.out.println("You have discount: " + discountAmount);
        }
        return sum - discountAmount;
    }

    private double calculateSum(List<Item> cart) {
        double total = 0;
        for (Item item : cart) {
            total = total + item.getPrice();
        }
        System.out.println("Total sum: " + total);
        return total;
    }
}
