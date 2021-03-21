package marzec;

import java.util.function.Predicate;

public class ZAD29 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 74, 8, 9, 5};

        Predicate<Integer> predicate = e -> {
            if (e % 3 == 0) {
                return true;
            }
            return false;
        };

        System.out.println(partOf(integers, predicate));
    }

    private static <T> Double partOf(T[] tab, Predicate<T> f) {
        int i = 0;
        for (T e : tab) {
            if (f.test(e)) {
                i++;
            }
        }
        return (double) i / tab.length * 100.0;
    }
}
