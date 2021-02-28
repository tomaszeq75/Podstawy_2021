package styczen;

import java.util.Scanner;

public class Zadanie13 {
    public Zadanie13() {
        Scanner in = new Scanner(System.in);
        String text;

        System.out.println("wpisz jakiś tekst");
        text = in.nextLine();

        String[] splittedText = text.split(" ");

        for (String t : splittedText) {
            System.out.print(t + " " + t + " ");
        }
    }
}
