package styczen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Założenia:
    1. nazwa użytkownika: litery, cyfry, "_", "."
        1.a "." musi być w środku (nie może być na początku ani na końcu nazwy użytkownika)
    2. Nazwa domeny litery, cyfry, "_", "-", "."
        2.a "." w nazwie domeny nie może występować na początku, na końcu i wiele razy po sobie
*/

public class RegexForEmail {
    String regexp = "(^\\w+(\\.*\\w+)*)@([\\w-]+(\\.[\\w-]+)*$)";
    Pattern pattern = Pattern.compile(regexp);
    Matcher matcher;
    String[] testedEmails = {
            "tom@wp.pl",
            "tom.wol@wp.pl",
            "tom@wp.com.pl",
            "tom9@wp9-1.pl",
            "tom_wol@wp-o2.com.pl",
            "---------",
            ".tom@wp.pl",
            "tom.@wp.pl",
            "tom+w@wp.pl",
            "tom@@wp.pl",
            "tom@wp..pl",
            "tom@wp.",
            "tom@wp.pl.",
            "tom-wol@wp.pl",
            "tom@.wp.pl"
    };

    RegexForEmail() {
        for (String email : testedEmails) {
            matcher = pattern.matcher(email);
            if (matcher.matches()){
                System.out.printf("adres: %s jest poprawny \t" +
                        "użytkownik: %s \t domena: %s \n", email, matcher.group(1), matcher.group(3));
            } else {
                System.out.printf("adres: %s jest niepoprawny\n", email);
            }
        }
    }
}
