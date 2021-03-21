package marzec;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ZAD26 {

    public interface IGetAllCars {
        List<Car> get(Set<Manufacturer> manufacturers);
    }

    public static void main(String[] args) {

        // 2a implementacja interfejsu funkcyjnego
        IGetAllCars iGetAllCars = man -> man.stream()
                .flatMap(m -> m.models.stream())
                .flatMap(c -> c.cars.stream())
                .collect(Collectors.toList());
//        List<Car> cars = iGetAllCars.get(manufacturer) // przykład wywołania
    }

    // 1
    public List<Model> getAllModels(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .collect(Collectors.toList());
    }

    // 2
    public List<Car> getAllCars(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .flatMap(c -> c.cars.stream())
                .collect(Collectors.toList());
    }

    // 3
    public List<String> getAllManufakturersNames(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .map(m -> m.name)
                .collect(Collectors.toList());
    }

    // 4
    public List<Integer> getAllManufakturerCreationYear(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .map(m -> m.yearOfCreation)
                .collect(Collectors.toList());
    }

    // 5
    public List<String> getAllModelsName(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .map(mm -> mm.name)
                .collect(Collectors.toList());
    }

    // 6
    public List<Integer> getAllModelsProductionYear(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .map(m -> m.productionStartYear)
                .collect(Collectors.toList());
    }

    // 7
    public List<String> getAllCarNames(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .flatMap(m -> m.cars.stream())
                .map(c -> c.name)
                .collect(Collectors.toList());
    }

    // 9
    public List<Model> getMoodelsByEvenProductionYear(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .filter(m -> m.productionStartYear % 2 == 0)
                .collect(Collectors.toList());
    }

    // 11
    public List<Car> getCarsWithEvenProductionYearAndOddManufacturerYear(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .filter(m -> m.yearOfCreation % 2 == 1)
                .flatMap(m -> m.models.stream())
                .filter(m -> m.productionStartYear % 2 == 0)
                .flatMap(m -> m.cars.stream())
                .collect(Collectors.toList());
    }

    // 12
    public List<Car> getCabrioCarsWithEvenProductionYearAndOddManufacturerYear(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .filter(m -> m.yearOfCreation % 2 == 0)
                .flatMap(m -> m.models.stream())
                .filter(m -> m.productionStartYear % 2 == 1)
                .flatMap(m -> m.cars.stream())
                .filter(c -> c.carType == CarType.CABRIO)
                .collect(Collectors.toList());
    }

    // 13
    public List<Car> getCarsSedanWithProductionYearAndOtherConditions(Set<Manufacturer> manufacturers) {
        return manufacturers.stream()
                .filter(m -> m.yearOfCreation < 2019)
                .flatMap(m -> m.models.stream())
                .filter(m -> m.productionStartYear > 2019)
                .flatMap(m -> m.cars.stream())
                .filter(c -> c.carType == CarType.SEDAN)
                .collect(Collectors.toList());
    }














}
