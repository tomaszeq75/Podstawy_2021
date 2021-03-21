package marzec;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad14 {
    public static void main(String[] args) {
        Double[] doubles = new Double[100000];

        Random random = new Random();

        List<Double> doubleList = Stream.generate(() -> Math.round(100000 * random.nextDouble()) / 100000.0)
                .limit(100000)
                .collect(Collectors.toList());

        // 1 i 2
        System.out.println(doubleList.size());

        Set<Double> unikDoubles = new HashSet<>();
        Set<Double> doubbled = new HashSet<>();
        for (double value : doubleList) {
            if (!unikDoubles.add(value)) {
                doubbled.add(value);
            }
        }
        System.out.println(doubbled.size());

        // 3
        // moje rozwiązanie
        Map<Double, Long> mapCounted = doubleList.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        List<Map.Entry<Double, Long>> newArrayList = new ArrayList<>(mapCounted.entrySet());

//        newArrayList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        newArrayList.sort((x, y) -> y.getValue().compareTo(x.getValue()));
        newArrayList = newArrayList.stream().limit(25).collect(Collectors.toList());
        System.out.println(newArrayList);


        // niestety nie moje, znalezione w sieci sortowanie map za pomocą streamów
        LinkedHashMap<Double, Long> sorted = new LinkedHashMap<>();
        mapCounted.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(25)
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

        System.out.println(sorted);
    }
}
