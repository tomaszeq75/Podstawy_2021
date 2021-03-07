package decorator;

public class PoliceCarDecorator extends BasicCarDecorator {

    public PoliceCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check polic systems");
    }
}
