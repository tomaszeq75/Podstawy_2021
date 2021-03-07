package pizzaDecorator;

public class PizzaBasic implements IPizza{
    int price = 10;
    private int size = 30;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getSize() {
        return size;
    }
}
