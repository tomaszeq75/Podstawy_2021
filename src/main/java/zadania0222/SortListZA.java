package zadania0222;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// zadanie 1 i 2

public class SortListZA {

    List<String> strings;

    public SortListZA(List<String> strings) {
        this.strings = strings;
    }

    public static List<String> sortZA(List<String> strings) {
        Comparator<String> comparator = Comparator.reverseOrder();
        Collections.sort(strings, comparator);
        return strings;
    }

    public static List<String> sortZAIgnoreCase(List<String> strings) {
        Comparator<String> comparator = (x, y) -> y.toLowerCase().compareTo(x.toLowerCase());
        Collections.sort(strings, comparator);
        return strings;
    }


}
