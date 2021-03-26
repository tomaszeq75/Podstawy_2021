package strategy_k;

public class StrategyDemo {
    public static void main(String[] args) {
        ShopingCart cart = new ShopingCart();
        cart.addItem(new Item("kalafior", "fjo25", 9));

        IPaymentStrategy strategy = new CardStrategy("adres@hej", 7089);
        ICalculateStrategy calcStrategy = new CalculateStrategy();
        cart.pay(strategy, calcStrategy);



    }
}
