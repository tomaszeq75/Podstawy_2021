package marzec;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService_13 {
    private List<Car_12> carList;

    public CarService_13() {
        carList = new LinkedList<>();
    }

    public void addCar(Car_12 car) { //dodawanie nowego auta
        carList.add(car);
    }

    public void removeCar(Car_12 car) {  //usuwanie auta z listy
        carList.remove(car);
    }

    public List<Car_12> getCarList() {   //zwracanie listy wszystkich aut
        return carList;
    }

    //ZAD13/4
    public List<Car_12> getV12Cars() {
        //pobieramy z obiektu carService_13 liste wszystkich aut
        return carList.stream()  //i tworzymy strumien
                //filtrujemy - czyli zostawiamy w strumieniu tylko te auta ktore maja silnik V12
                .filter(c -> c.getEngineType().equals(EngineType.V12))
                //na koncu zamieniamy to co zostalo w strumieniu na liste i to zwracamy
                .collect(Collectors.toList());
    }

    //ZAD13/5
    public List<Car_12> getCarsMadeBefore1999() {
        return carList.stream()
                //filtrowanie aut wyprodukowanych przed 1999
                .filter(c -> c.getYear() < 1999)
                .collect(Collectors.toList());
    }

    //ZAD13/6
    public Car_12 getMostExpensiveCar() {
        return carList.stream()
                .max(Comparator.comparing(Car_12::getPrice)).get();
    }

    //ZAD13/7
    public Car_12 getLeastExpensiveCar() {
        return carList.stream()
                .min(Comparator.comparing(Car_12::getPrice)).get();
    }

    //ZAD13/8
    public Car_12 getCarWithAtLeast3Manufacturers() {
        return carList.stream()
                .filter(c -> c.getManufacturers().size() >= 3)
                .limit(1)
                .collect(Collectors.toList()).get(0);
    }

    //ZAD13/9
    public List<Car_12> sortCarList(String string) {
        switch (string) {
            case "ROSNACO":
                return carList.stream()
                        .sorted(Comparator.comparing(Car_12::getName))
                        .collect(Collectors.toList());
            case "MALEJACO":
                return carList.stream()
                        .sorted(Comparator.comparing(Car_12::getName).reversed())
                        .collect(Collectors.toList());
            default:
                return carList;
        }
    }

    //ZAD13/10
    public boolean containsCar(Car_12 car) {
        return carList.contains(car);
    }

    //ZAD13/11
    public List<Car_12> getCarsMadeBySpecificManufacturer(Manufacturer_12 mfr) {
        return carList.stream()
                .filter(c -> c.getManufacturers().contains(mfr))
                .collect(Collectors.toList());
    }

    //ZAD13/12
    public List<Car_12> getCarsMadeBySpecificManufacturerOfYear(String s, Integer y) {
        switch (s) {
            case "<":
                return carList.stream() //tutaj mamy samochody
                        .filter(c -> c.getManufacturers().stream()
                                .filter(m -> m.getYear() < y).count() > 0)
                        .collect(Collectors.toList());
            case ">":
                return carList.stream()
                        .filter(c -> c.getManufacturers().stream()
                                .filter(m -> m.getYear() > y).count() > 0)
                        .collect(Collectors.toList());
            case "<=":
                return carList.stream()
                        .filter(c -> c.getManufacturers().stream()
                                .filter(m -> m.getYear() <= y).count() > 0)
                        .collect(Collectors.toList());
            case ">=":
                return carList.stream()
                        .filter(c -> c.getManufacturers().stream()
                                .filter(m -> m.getYear() >= y).count() > 0)
                        .collect(Collectors.toList());
            case "=":
                return carList.stream()
                        .filter(c -> c.getManufacturers().stream()
                                .filter(m -> m.getYear() == y).count() > 0)
                        .collect(Collectors.toList());
            case "!=":
                return carList.stream()
                        .filter(c -> c.getManufacturers().stream()
                                .filter(m -> m.getYear() != y).count() > 0)
                        .collect(Collectors.toList());
            default:
                return carList;
        }
    }

    public void sortBy(Comparator... c) {
        int counter = c.length;
        if (counter < 1) {
            System.out.println("Sortowanie - brak komparatora");
            return;
        }

        Comparator<Car_12> comparator = c[0];
        for (int i = 1; i < counter; i++) {
            comparator = comparator.thenComparing(c[i]);
        }

        Collections.sort(carList, comparator);
    }

}
