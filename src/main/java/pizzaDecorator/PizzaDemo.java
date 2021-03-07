package pizzaDecorator;

public class PizzaDemo {
    public static void main(String[] args) {

        IPizza pizza1 = new PizzaBasic();
        System.out.println(pizza1.getPrice());

        IPizza pizzaBasicDecorator = new BasicPizzaDecorator(new PizzaBasic());
        System.out.println(pizzaBasicDecorator.getPrice());

        IPizza pizzaHam = new BasicPizzaDecorator(new PizzaHamDecorator(new PizzaBasic()));
        System.out.println(pizzaHam.getPrice());

        IPizza pizzaHamMozarella = new PizzaMozarellaDecorator(pizzaHam);
        System.out.println(pizzaHamMozarella.getPrice());
        System.out.println(pizzaHamMozarella.getSize());
    }
}
