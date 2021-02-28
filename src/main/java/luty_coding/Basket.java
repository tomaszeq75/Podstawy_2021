package luty_coding;

import java.util.HashSet;
import java.util.Set;

public class Basket {
    Set<Product> basket = new HashSet<>();

    boolean add(Product product) {
        return basket.add(product);
    }

    boolean remove(Product product) {
        return basket.remove(product);
    }

    boolean remove(String id) {
        return basket.remove(new Product("", id, 0));
    }

    void show() {
        for (Product p : basket) {
            System.out.println(p.toString());
        }
        System.out.println();
    }
}
