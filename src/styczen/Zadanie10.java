package styczen;

import java.util.Scanner;

public class Zadanie10 {
    Scanner in = new Scanner(System.in);
    int number;

    Zadanie10() {
        do {
            System.out.println("Podaj liczbę dodatnią");
            number = in.nextInt();
        } while (number < 1);

        method2();
        method1();
    }

    private void method2() {
        String stringNumber = Integer.toString(number);

        int suma = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            int value = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
            suma += value;
        }
        System.out.println(suma);
    }

    private void method1() {
        int suma = 0;
        while (number > 0) {
            suma += number % 10;
            number /= 10;
        }
        System.out.println(suma);
    }
}
