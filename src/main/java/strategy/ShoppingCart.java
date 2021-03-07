package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }

    public int calculateTotal() {
        int total = 0;
        for (Item item : cart) {
            total = total + item.getPrice();
        }
        return total;
    }

    public void pay(IPaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
    }

}
