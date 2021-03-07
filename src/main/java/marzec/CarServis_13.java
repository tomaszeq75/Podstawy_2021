package marzec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarServis_13 {
    private List<Car_12> cars;

    public CarServis_13() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car_12 car) {
        cars.add(car);
    }

    public void removeCar(Car_12 car) {
        cars.remove(car);
    }

    public List<Car_12> getCars() {
        return cars;
    }

    public List<Car_12> getCarsByEngine(EngineType type) {
        return cars.stream().filter(x -> x.getEngineType() == type)
                .collect(Collectors.toList());
    }

    public Car_12 getMostExpensiveCar() {
        return cars.stream().max(Comparator.comparing(Car_12::getPrice)).get();
    }

    public Car_12 getLessExpensiveCar() {
        return cars.stream().min(Comparator.comparing(Car_12::getPrice)).get();
    }

    public List<Car_12> getCarsProducedBefore(int year) {
        return cars.stream().filter(x -> x.getYear() < year)
                .collect(Collectors.toList());
    }

    public List<Car_12> getCarsWithXManufacturers(int x) {
        return cars.stream().filter((c -> c.getManufacturers().size() == x))
                .collect(Collectors.toList());
    }

    public void sort(String choice) {
        Comparator comparator = Comparator.reverseOrder();
        if ("up".equals(choice)) {
            comparator = Comparator.naturalOrder();
        }
        Collections.sort(cars, comparator);
    }

    public List<Car_12> getCarsByManufacturer(Manufacturer_12 m) {
        return cars.stream().filter(car_12 -> car_12.getManufacturers().contains(m))
                .collect(Collectors.toList());
    }

    public List<Car_12> getCarsByManufacturerStartYear(int year, Option option) {
// todo można z zagnieżdżonym strumieniu
        for (Car_12 car : cars) {
            List<Manufacturer_12> man = car.getManufacturers();

            switch (option) {
                case EQUAL:
//                    if (man.contains(new Manufacturer_12("z",)))
                    break;
                case NOT_EQUAL:
                    break;
                case LESS:
                    break;
                case LESS_EQUAL:
                    break;
                case GREATER:
                    break;
                case GREATER_EQUAL:
                    break;
            }
            return cars;
        }
        return null;
    }
}
