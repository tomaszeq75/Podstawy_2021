package styczen;

import java.io.*;
import java.util.Scanner;

public class Zadanie12 {

    Zadanie12() {
        percentOfSpacesFromFile();
        percentOfSpaces();
    }

    private void percentOfSpacesFromFile() {
        File file = new File("tekst.txt");
        String text;
        int numberOfXChars = 0;
        int numberOfCharsInFile = 0;

        System.out.println("podaj szukany znak");
        Scanner in = new Scanner(System.in);
        char szukanyZnak = in.next().charAt(0);

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            while (true) {
                text = fileReader.readLine();
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == szukanyZnak) {
                        numberOfXChars++;
                    }
                    numberOfCharsInFile += text.length();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("-------------");
        }

        System.out.println("Liczba znaków " + szukanyZnak + " = " + numberOfXChars);
        System.out.println("Liczba wszystkich znaków w tekście: " + numberOfCharsInFile);


    }

    private void percentOfSpaces() {
        String textToCheck = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        int numberOfChars = textToCheck.length();

        int numberOfSpaces = 0;

        for (int i = 0; i < textToCheck.length(); i++) {
            if (textToCheck.charAt(i) == ' ') numberOfSpaces++;
        }

        System.out.println("Liczba znaków: " + numberOfChars);
        System.out.println("Liczba spacji: " + numberOfSpaces);
        System.out.println("spacje stanowią " + (double) numberOfSpaces / numberOfChars * 100.0 + "% wszystkich znaków w tekście");
    }

}

