package stream_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilteringExample {


    //Scenariusz filtrowania
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Rambo");
        names.add("Rocky");
        names.add("Marek");
        names.add("Terminator");

        List<String> newNames = names.stream().filter(name -> name.contains("o")).collect(Collectors.toList());
        System.out.println(newNames);

    }

}
