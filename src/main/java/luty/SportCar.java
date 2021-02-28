package luty;

public class SportCar extends AbstractCar{

    private int carPower, maxSpeed;

    public SportCar(String vehicleName) {
        super(vehicleName);
    }

    public SportCar(String vehicleName, String vin) {
        super(vehicleName, vin);
    }

    public SportCar(String vehicleName, String vin, String plates) {
        super(vehicleName, vin, plates);
    }

    public int getCarPower() {
        return carPower;
    }

    public void setCarPower(int carPower) {
        this.carPower = carPower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    String getCarModel() {
        return null;
    }

    @Override
    double getCarWeight() {
        return 0;
    }

    @Override
    public int compareTo(Bus o) {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof SportCar) {
            SportCar sportCar = (SportCar) o;
            return this.carPower - sportCar.getCarPower();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Nazwa: " + getVehicleName() +
                " moc: " + getCarPower() +
                " vMax: " + getMaxSpeed();
    }
}
