package decorator;

public class LuxuryCarDecorator extends BasicCarDecorator {
    public LuxuryCarDecorator(ICar car) {
        super(car);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check aircondition");
    }
}
