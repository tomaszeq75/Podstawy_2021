package styczen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie15 {
    // todo skończyć może z HashMap aaa
    int[] numbers = new int[10];
    Scanner in = new Scanner(System.in);
    int[] doubledNumbers = new int[10];
    int doubleNumbersIndex = 0;
    HashMap map;


    public Zadanie15() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Podaj %d liczbę\n", i + 1);
            numbers[i] = in.nextInt();
        }
        boolean isThere = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    for (int num : doubledNumbers) {
                        if (num != numbers[i]) {
                            isThere = true;
                        }
                        if (!isThere){
                            doubledNumbers[doubleNumbersIndex++] = numbers[i];
                            isThere = false;
                        }
                    }
                }
            }
        }
        for (int number : doubledNumbers) {
            System.out.println("podwójna liczba: " + number);
        }
    }
}