package styczen;

import java.util.Scanner;

public class Zadanie9 {
    Scanner in = new Scanner(System.in);
    int waveLenght;

    Zadanie9() {
        System.out.println("podaj liczbę");
        waveLenght = in.nextInt();
        version2();
    }

    private void version2() {
        for (int j = 0; j < 4; j++) {

            for (int i = 0; i < waveLenght; i++) {
                if ((i - j) % 8 == 0 || (i + j + 1) % 8 == 0) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void version1() {
        for (int i = 0; i < waveLenght; i++) {
            if (i % 8 == 0 || (i + 1) % 8 == 0) {
                System.out.print("*");
            } else System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < waveLenght; i++) {
            if ((i - 1) % 8 == 0 || ((i + 2) % 8 == 0)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 0; i < waveLenght; i++) {
            if ((i - 2) % 8 == 0 || ((i + 3) % 8 == 0)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 0; i < waveLenght; i++) {
            if ((i - 3) % 8 == 0 || ((i + 4) % 8 == 0)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
