package styczen;

import java.util.Arrays;

public class Zadanie16 {
    int[] values = {1, 3, 4, 8, 2, 5, 6, 11, 7,1,2,3,1,2,3,1,2,3};

    public Zadanie16() {
        int currentValue = Integer.MIN_VALUE;
        int longest = 0;
        int howLong = 0;

        for (int value : values) {
            if (value > currentValue) {
                howLong++;
            } else {
                if (howLong > longest) {
                    longest = howLong;
                }
                howLong = 1;
            }
            currentValue = value;
        }
        System.out.println("tablica: " + Arrays.toString(values));
        System.out.println("Najdłuższy rosnący ciąg to: " + longest);
    }
}
