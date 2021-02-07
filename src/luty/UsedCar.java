package luty;

public class UsedCar implements Vehicle{
    private String model;
    private String vin;
    private int productionYear;

    public UsedCar(String model, String vin, int productionYear) {
        this.model = model;
        this.vin = vin;
        this.productionYear = productionYear;
    }

    public int getHowOldItIs() {
        return 2021 - productionYear;
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
        System.out.println("I'm going by old car");
    }

    @Override
    public void stop() {
        System.out.println("I'm stopped my old car");
    }
}
