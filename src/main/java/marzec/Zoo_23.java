package marzec;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Zoo_23 {

    Map<String, Integer> animals = new HashMap<>();

    public Integer getNumberOfAllAnimals() {
        Collection<Integer> intCollection = animals.values();

        Optional<Integer> count = intCollection.stream().reduce(Integer::sum);
        return count.orElse(0);
    }

    public Map<String, Integer> getAnimalsSorted() {
        // todo zrobić sortowanie
        return null;
    }

}
