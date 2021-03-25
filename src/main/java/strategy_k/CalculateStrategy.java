package strategy_k;

import java.util.List;

public class CalculateStrategy implements ICalculateStrategy {

    private int discount = -2;

    @Override
    public int calc(List<Item> cart) {
        int total = 0;
        for (Item item : cart) {
            total += item.getPrice() + discount;
        }
        return total;
    }
}
