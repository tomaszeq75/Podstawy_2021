package luty;

abstract class AbstractCar extends Vehicle implements Comparable {

    private String vin, plates;

    public AbstractCar(String vehicleName) {
        super(vehicleName);
    }

    public AbstractCar(String vehicleName, String vin) {
        super(vehicleName);
        this.vin = vin;
    }

    public AbstractCar(String vehicleName, String vin, String plates) {
        super(vehicleName);
        this.vin = vin;
        this.plates = plates;
    }

    abstract String getCarModel();

    abstract double getCarWeight();

    public abstract int compareTo(Bus o);
}
