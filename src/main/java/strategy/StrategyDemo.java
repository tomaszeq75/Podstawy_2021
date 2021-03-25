package strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("kalafior", "fjo25", 150));

        IPaymentStrategy card = new CardStrategy("adre@hej", 7089);
        IPaymentStrategy cash = new CashStrategy();
        ICalculateStrategy discount = new DiscountStrategy(10);

        cart.pay(card, discount);
        cart.pay(cash, discount);


    }

}
