package zadania0222;

import java.util.Objects;

// zadanie 4
public class Laptop extends Computer{
    int batteryCapacity;

    public Laptop(String procesor, String vga, String vendor, String model, int ram, int procesorSpeed, int batteryCapacity) {
        super(procesor, vga, vendor, model, ram, procesorSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryCapacity == laptop.batteryCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity);
    }

    @Override
    public String toString() {
        return super.toString() + ", battery: " + batteryCapacity + "mAh";
    }
}
