package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }

    public void pay(IPaymentStrategy paymentStrategy, ICalculateStrategy calculateStrategy) {
        paymentStrategy.pay(calculateStrategy.calculateTotal(cart));
    }

}
