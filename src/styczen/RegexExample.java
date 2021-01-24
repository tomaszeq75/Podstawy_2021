package styczen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    String input = "email@suba.aaa";
    String regexp = "([a-zA-Z]+)@([a-zA-Z]+(\\.[a-zA-Z])+)";

    Pattern pattern = Pattern.compile(regexp);
    Matcher matcher = pattern.matcher(input);

    public void check() {
        if (matcher.matches()) {
            System.out.println("nazwa użytkownika: " + matcher.group(1));
            System.out.println("domena: " + matcher.group(2));
        } else System.out.println("nieprawidłowy adres e-mail");
    }
}
