package marzec;

import java.util.Comparator;

public enum CustomComparator {
    NAME(Comparator.comparing(Car_12::getName)),
    MODEL(Comparator.comparing(Car_12::getModel)),
    PRICE(Comparator.comparing(Car_12::getPrice)),
    PRODUCTION_YEAR(Comparator.comparing(Car_12::getYear)),
    ENGINE(Comparator.comparing(Car_12::getEngineType));

    public Comparator<Car_12> compare;
    public Comparator<Car_12> reversed;

    CustomComparator(Comparator<Car_12> compare) {
        this.compare = compare;
        this.reversed = compare.reversed();
    }
}
