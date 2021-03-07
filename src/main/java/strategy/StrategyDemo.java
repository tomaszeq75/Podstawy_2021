package strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("kalafior", "fjo25", 150));

        IPaymentStrategy strategy = new CardStrategy("adre@hej", 7089);
        cart.pay(strategy);

        IPaymentStrategy discount = new DiscountStrategy(10);
        cart.pay(discount);
    }

}
