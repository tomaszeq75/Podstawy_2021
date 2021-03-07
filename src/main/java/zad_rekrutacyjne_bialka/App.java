package zad_rekrutacyjne_bialka;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException {

//        Path path = Path.of(args[0]);
        Path path = Path.of("aminoAcids.txt");
        List<String> aminoAcids = Files.readAllLines(path);

        for (int i = 0; i < aminoAcids.size(); i += 2) {
            String s1 = aminoAcids.get(i);
            String s2 = aminoAcids.get(i + 1);

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(changePossible(s1, s2) ? "Change possible\n" : "Change impossible\n");
        }
    }

    private static boolean changePossible(String s1, String s2) {
        Map<Character, Integer> amino1 = getAminoMap(s1);
        Map<Character, Integer> amino2 = getAminoMap(s2);
        return amino1.equals(amino2);
    }

    private static Map<Character, Integer> getAminoMap(String aminoAcid1) {
        Map<Character, Integer> amino = new HashMap<>();
        for (int j = 0; j < aminoAcid1.length(); j++) {
            Character ch = aminoAcid1.charAt(j);
            amino.put(ch, amino.containsKey(ch) ? (amino.get(ch) + 1) : 1);
        }
        return amino;
    }
}

