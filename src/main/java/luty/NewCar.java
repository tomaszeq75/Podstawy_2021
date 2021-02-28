package luty;

public class NewCar implements IVehicle {
    private String model;
    private String vin;

    public NewCar(String model, String vin) {
        this.model = model;
        this.vin = vin;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getVin() {
        return vin;
    }

    @Override
    public void go() {
        System.out.println("I'm going");
    }

    @Override
    public void stop() {
        System.out.println("I'm stopped");
    }
}
