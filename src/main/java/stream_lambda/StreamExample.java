package stream_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {

    //Scenariusz sprawdzania, czy element jest na liscie

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Rambo");
        names.add("Rocky");
        names.add("Marek");
        names.add("Terminator");

        for (String name : names) {
            if (name.equals("Rambo")) {
//                return true;
                System.out.println("Rambo jest na liscie");
                break;
            }
        }

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Rambo");
            }
        };
//        boolean isListContainsRambo = names.stream().anyMatch(predicate);
        boolean isListContainsRambo = names.stream()
                .anyMatch(x -> x.equals("Rambo"));
        System.out.println(isListContainsRambo);

    }

}
