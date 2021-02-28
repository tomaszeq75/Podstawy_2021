package zadania0222;

// zadanie 3

import java.util.Objects;

public class Computer implements Comparable<Computer>{

    private String procesor;
    private String vga;
    private String vendor;
    private String model;
    private int ram;
    private int procesorSpeed;

    public Computer(String procesor, String vga, String vendor, String model, int ram, int procesorSpeed) {
        this.procesor = procesor;
        this.vga = vga;
        this.vendor = vendor;
        this.model = model;
        this.ram = ram;
        this.procesorSpeed = procesorSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && procesorSpeed == computer.procesorSpeed && procesor.equals(computer.procesor) && vga.equals(computer.vga) && vendor.equals(computer.vendor) && model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesor, vga, vendor, model, ram, procesorSpeed);
    }

    @Override
    public String toString() {
        return "Computer: " +
                "procesor: '" + procesor + '\'' +
                ", vga: '" + vga + '\'' +
                ", vendor: '" + vendor + '\'' +
                ", model '" + model + '\'' +
                ", ram " + ram +
                "GB, procesorSpeed: " + procesorSpeed + "MHz";
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getProcesorSpeed() {
        return procesorSpeed;
    }

    public void setProcesorSpeed(int procesorSpeed) {
        this.procesorSpeed = procesorSpeed;
    }

    @Override
    public int compareTo(Computer computer) {

        int result = Integer.compare(this.procesorSpeed, computer.procesorSpeed);
        if (result != 0 ){
            return result;
        }

        if ((result = Integer.compare(this.ram, computer.ram)) != 0) {
            return result;
        }

        return this.procesor.compareToIgnoreCase(computer.procesor);
    }
}
