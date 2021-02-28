package styczen;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie18 {
    String[] texts = {
            "tekst a psik dalszy tekst",
            "coś tam aaaaa psik coś dalej",
            "--- coś tam aaa aaaaa psi coś dalej",
            "--- coś tam aaa  psik coś dalej",
            "--- a apsik"
    };
    String textToFindRegEx = ".*a+ psik.*";
    Pattern pattern = Pattern.compile(textToFindRegEx);

    public Zadanie18() {

        for (String text : texts) {
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                System.out.println("W tekście: " + text + " jest a psik");
            } else {
                System.out.println("W tekście: " + text + " ---- nie ma a psik");
            }
        }
    }
}
