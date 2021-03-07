package marzec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class StringSorting {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("aaa");
        strings.add("ccc");
        strings.add("Ggg");
        strings.add("bbb");
        strings.add("Ooo");
        strings.add("zzz");
        strings.add("hhh");

        System.out.println(sortZA(strings));
        System.out.println(sortZACaseInsensitive(strings));

    }

    public static List<String> sortZA(List<String> strings) {
        Collections.sort(strings, Collections.reverseOrder());
        return strings;
    }

    public static List<String> sortZACaseInsensitive(List<String> strings) {
        List<String> stringList = new ArrayList<>();
        Collections.sort(strings, String.CASE_INSENSITIVE_ORDER.reversed());
//        Collections.sort(strings, (x, y) -> y.toLowerCase().compareTo(x.toLowerCase()));
        return strings;
    }
}
