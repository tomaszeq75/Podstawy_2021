package refleksje;

public class Car {
    private String vin, model;

    public Car(String vin, String model) {
        this.vin = vin;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
