package styczen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zadanie11 {
    String text;
    Scanner in = new Scanner(System.in);

    Zadanie11() {
        longestSentence();
        longestWordInText();
    }

    private void longestWordInText() {
        String textToCheck = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String[] textArray = textToCheck.split(" ");

        int longestStringLenght = 0;
        String longestString ="";
        for (String text : textArray) {
            if (text.length() > longestStringLenght) {
                longestStringLenght = text.length();
                longestString = text;
            }
        }
        System.out.println("Najdłuższy wyraz w tekście: " + longestString);
    }

    private void longestSentence() {
        ArrayList<String> teksty = new ArrayList<>();
        String textLine;

        do {
            System.out.println("Podaj jakiś tekst (q - koniec)");
            textLine = in.nextLine();
            if("q".equals(textLine)) break;
            teksty.add(textLine);
        } while (true);

        int longestValue = 0;
        String longestText = "";

        for (String text: teksty) {
            if (text.length() > longestValue) {
                longestValue = text.length();
                longestText = text;
            }
        }

        System.out.println("Najdłuższy tekst: " + longestText);
    }
}
