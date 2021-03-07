package marzec;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car_12 implements Comparable{
    private String name, model;
    private Double price;
    private Integer year;
    private EngineType engineType;
    private List<Manufacturer_12> manufacturers = new ArrayList<>();

    public Car_12(String name, String model, Double price, Integer year, EngineType engineType, List<Manufacturer_12> manufacturers) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.engineType = engineType;
        this.manufacturers = manufacturers;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public List<Manufacturer_12> getManufacturers() {
        return manufacturers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car_12 car_12 = (Car_12) o;
        return Objects.equals(name, car_12.name) && Objects.equals(model, car_12.model) && Objects.equals(price, car_12.price) && Objects.equals(year, car_12.year) && engineType == car_12.engineType && Objects.equals(manufacturers, car_12.manufacturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, year, engineType, manufacturers);
    }

    @Override
    public String toString() {
        return "[" + name + " : " + model + " : " + price + " zł : " + year + " : "
                + engineType + " : " + manufacturers + ']';
    }

    @Override
    public int compareTo(Object o) {
        Car_12 c = (Car_12) o;
        if (this.price.compareTo(c.price) == 0){
            return this.year.compareTo(c.year);
        } else {
            return this.price.compareTo(c.price);
        }
    }
}
