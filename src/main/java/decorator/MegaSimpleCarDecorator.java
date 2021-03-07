package decorator;

public class MegaSimpleCarDecorator implements ICar {

    private Car basicCar = new Car();

//    public MegaSimpleCarDecorator(ICar basicCar) {
//        this.basicCar = basicCar;
//    }

    @Override
    public void startEngine() {
        System.out.println("Dodaje zachowanie");
        //wywoluje bazowe zachowanie
        this.basicCar.startEngine();
    }
}
