package decorator;

public class BasicCarDecorator implements ICar {

    private ICar basicCar;

    public BasicCarDecorator(ICar car) {
        this.basicCar = car;
    }

    @Override
    public void startEngine() {
        //tu mozemy cos dodac, jakies zachowanie
        this.basicCar.startEngine();
    }
}
