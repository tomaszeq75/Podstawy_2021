package luty;

public class Bus extends AbstractCar {

    private int passengers;
    private int maximumNumberOfPassengers;

    public Bus(String vehicleName, int passengers) {
        super(vehicleName);
        this.passengers = passengers;
        maximumNumberOfPassengers = 60;
    }

    public Bus(String vehicleName, String vin, int passengers) {
        super(vehicleName, vin);
        this.passengers = passengers;
    }

    public Bus(String vehicleName, String vin, String plates, int passengers) {
        super(vehicleName, vin, plates);
        this.passengers = passengers;
    }

    public void addPassenger() {
        passengers++;
        System.out.println("passenger added");
    }

    public void removePassenger() {
        if (passengers > 0) {
            passengers--;
        }
        System.out.println("passenger removed");
    }

    public int getNumberOfPassengers() {
        return passengers;
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
        // tak powinno to się robić
        // return Integer.compare(this.getNumberOfPassengers(), o.getNumberOfPassengers());
        return 0;
    }

    @Override
    public String toString() {
        return "Nazwa: " + getVehicleName() + " liczba pasażerów: " + passengers;
    }
}
