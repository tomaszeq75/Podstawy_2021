package styczen;

import java.util.Scanner;

public class Zadanie4 {
    int number;
    Scanner in = new Scanner(System.in);

    Zadanie4() {
        System.out.println("podaj liczbę > 1:");
        number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("Pif Paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
