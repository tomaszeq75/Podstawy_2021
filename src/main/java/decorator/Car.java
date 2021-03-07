package decorator;

public class Car implements ICar {
    @Override
    public void startEngine() {
        System.out.println("Basic car start engine");
    }

    //Car
    //PoliceCar
    //LuxuryCar
    //Bus
}
