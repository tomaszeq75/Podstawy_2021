package styczen;

import java.util.Scanner;

public class Zadanie14 {
    Scanner in = new Scanner(System.in);

    public Zadanie14() {
        System.out.println("podaj 2 znaki");
        String chars = in.nextLine();
        char firstChar = chars.charAt(0);
        char seccondChar = chars.charAt(1);

        if (firstChar == seccondChar) {
            System.out.println("Obydwa znaki są takie same");
            System.exit(0);
        }

        System.out.printf("Pomiędzy znakami \"%s\" a \"%s\" jest %d znaków",
                firstChar, seccondChar, Math.abs(seccondChar - firstChar - 1));
    }
}
