package luty_coding;

import java.util.Objects;

public class Product {
    String name;
    String code;
    double price;

    public Product(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + " " + code + ' ' + price + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(code, product.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
