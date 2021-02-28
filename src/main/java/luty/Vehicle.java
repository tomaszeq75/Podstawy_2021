package luty;

public class Vehicle {
    private String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public String toString() {
        return vehicleName + " - " + this.getClass().getName();
    }
}
