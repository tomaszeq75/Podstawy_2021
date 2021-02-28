package styczen;

import java.util.Scanner;

public class PrimeNumbers {
    int number;
    Scanner in = new Scanner(System.in);

    PrimeNumbers() {
        boolean isPrime = true;
        number = in.nextInt();

        for (int i = 2; i < number; i++) {
            isPrime = isPrime(i);
            System.out.println("i: " + i + "  " + isPrime);
        }
    }

    private boolean isPrime(int i) {
        boolean isPrime;
        isPrime = true;

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
