package luty_coding;

public class Car {
    private double fuelConsumption, fuelTankCapacity;

    public Car(double fuelConsumption, double fuelTankCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getRange() {
        return new RangeCalculator().getRange();
    }

    private class RangeCalculator {
        private int age = 10;
        private double getRange() {
            return fuelTankCapacity / fuelConsumption * 100;
        }
    }

}
