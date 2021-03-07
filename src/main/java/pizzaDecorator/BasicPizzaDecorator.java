package pizzaDecorator;

public class BasicPizzaDecorator implements IPizza {

    private IPizza basicPizza;


    public BasicPizzaDecorator(IPizza basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public int getPrice() {
        return basicPizza.getPrice();
    }

    @Override
    public int getSize() {
        return basicPizza.getSize();
    }
}
