package strategy_k;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {

    private List<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }

    public int calculateTotal(ICalculateStrategy strategy) {
        int total = strategy.calc(cart);

        return total;
    }

    public void pay(IPaymentStrategy paymentStrategy, ICalculateStrategy calcStrategy) {
        paymentStrategy.pay(calculateTotal(calcStrategy));
    }

}
