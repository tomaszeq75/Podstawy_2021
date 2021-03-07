package pizzaDecorator;

public class PizzaHamDecorator extends BasicPizzaDecorator {

    int hamPrice = 5;

    public PizzaHamDecorator(IPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + hamPrice;
    }
}
