package marzec;

import java.io.Serializable;

public class Car implements Serializable {
    public String name;
    public String description;
    public CarType carType;

    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", description='" + description                ; }
}
