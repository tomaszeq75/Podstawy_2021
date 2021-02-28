package stream_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMatchingExample {

    //Scenariusz matching
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Rambo");
//        names.add("Rocky");
        names.add("Marek");
        names.add("Terminator");

        boolean isValidAnyMatch = names.stream().anyMatch(name -> name.contains("a"));
        System.out.println("isValidAnyMatch " + isValidAnyMatch);

        boolean isValidAllMatch = names.stream().allMatch(name -> name.contains("a"));
        System.out.println("isValidAllMatch " + isValidAllMatch);

        boolean isValidNoneMatch = names.stream().noneMatch(name -> name.contains("x"));
        System.out.println("isValidNoneMatch " + isValidNoneMatch);


    }

}
