package styczen;

import java.util.Random;
import java.util.Scanner;

public class Zadanie20 {
    int numberToGuess = new Random().nextInt(100);
    Scanner in = new Scanner(System.in);


    public Zadanie20() {
        int myNumber;

        System.out.printf("Podaj liczbę od 0 do 100 [%d]\n", numberToGuess);

        do {
            myNumber = in.nextInt();
            if (myNumber > numberToGuess) {
                System.out.println(myNumber + " za dużo");
            } else if (myNumber != numberToGuess) {
                System.out.println(myNumber + " za mało");
            }
        } while (myNumber != numberToGuess);

        System.out.println("Zgadłeś !!! To liczba: " + myNumber);
    }
}
