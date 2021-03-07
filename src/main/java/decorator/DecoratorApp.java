package decorator;

public class DecoratorApp {

    public static void main(String[] args) {

        ICar car = new Car();
//        car.startEngine();

        ICar carDecorator = new BasicCarDecorator(car);
//        carDecorator.startEngine();

        ICar carLuxuryDecorator = new LuxuryCarDecorator(carDecorator);
//        carLuxuryDecorator.startEngine();

        ICar policeCarDecorator = new PoliceCarDecorator(carLuxuryDecorator);
//        policeCarDecorator.startEngine();

        ICar object = new PoliceCarDecorator(new LuxuryCarDecorator(new Car()));
        object.startEngine();

    }

}
