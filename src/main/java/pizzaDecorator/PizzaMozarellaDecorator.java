package pizzaDecorator;

public class PizzaMozarellaDecorator extends BasicPizzaDecorator {

    int mozarellaPrice = 7;

    public PizzaMozarellaDecorator(IPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + mozarellaPrice;
    }
}
