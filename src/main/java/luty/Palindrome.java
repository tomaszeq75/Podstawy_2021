package luty;

import java.util.Scanner;

public class Palindrome implements IPalindrome {
    String string;

    public Palindrome() {
        Scanner in = new Scanner(System.in);
        string = in.nextLine();
    }

    public void print() {
        System.out.println("Długość tekstu: " + getLength(string));
        System.out.println("Oryginalny tekst: " + string);
        System.out.println("Odwrócony tekst: " + reverse());
        System.out.println("Palindrom: " + isPalindrome());
    }

    public int getLength(String string) {
        return string.length();
    }

    public boolean isPalindrome() {
        String reverse = reverse();

        if (string.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    private String reverse() {
        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }

        return reversedString;
    }


}
