package marzec;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ZAD31 {
    public static void main(String[] args) {

//        String inputFilePath = "c:\\Users\\twoly\\Documents\\SDA_Projects\\Podstawy_2021\\pan-tadeusz.txt";
        String inputFilePath = "C:\\Users\\Tomek\\IdeaProjects\\Podstawy_2021\\pan-tadeusz.txt";
        String inputText = readFile(inputFilePath);

        List<String> words = Arrays.asList(inputText.split("[ ,.-?!()_\"\'«»\n—]"));

        Map<String, Long> wordsCount = words.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        List<Map.Entry<String, Long>> wordsCountSorted = new LinkedList<>(wordsCount.entrySet());
        wordsCountSorted = wordsCountSorted.stream()
                .filter(e -> e.getKey().length() > 1)
                .sorted((x, y) -> y.getValue().compareTo(x.getValue()))
                .limit(25)
                .collect(Collectors.toList());

        Map<String, Long> wordsCountSortedMap = new LinkedHashMap<>();

        // todo niestety sortowanie nie działa
//        wordsCountSortedMap = wordsCount.entrySet().stream()
//                .filter(e -> e.getKey().length() > 1)
//                .sorted((x, y) -> y.getValue().compareTo(x.getValue()))
//                .limit(25)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for (Map.Entry<String, Long> entry : wordsCountSorted) {
            wordsCountSortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("-----");
        for (Map.Entry<String, Long> entry : wordsCountSortedMap.entrySet()) {
            System.out.println(entry.getValue() + ":" + entry.getKey());
        }

        String outputText = "";
        StringBuilder builder = new StringBuilder();
        String horizontalLine = "-------------------------------\n";

        for (Map.Entry<String, Long> entry : wordsCountSortedMap.entrySet()) {

            builder.append(horizontalLine)
                    .append(new StringBuilder()
                            .append("                                     ")
                            .insert(0, "|") //dodanie linii pionowej
                            .insert(2, entry.getKey())
                            .insert(15, "|")
                            .insert(17, entry.getValue())
                            .insert(30, "|")
                            .append(System.lineSeparator())
                            .toString());
        }

        System.out.println(builder.toString());
    }


    public static void createFile(String path, String text) {
        //zaczynamy od utworzenia pliku
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("File created"); //gdy plik zostanie utworzony zwrocone zostanie true
            } else {
                System.out.println("File already exists"); //gdy plik nie zostanie utworzony zostanie zwrocone false
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //wstawiamy tekst do utworzonego pliku
        //w nawiasie okraglym wpisujemy zasoby ktore bedziemy uzywac
        //bedzie dzialac to w taki ze te zasoby zostana automatycznie zwolnione zarowno w przypadku powodzenia
        //instrukcji z bloku try jak i niepowodzenia
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(text);
            System.out.println("Text written to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String path) {
        String s = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            //uzywajac metody lines() tworzymy strumien a nastepenie zamieniamy go na stringa
            //w strumieniu tym znajduja sie kolejne wiersze z pliku, wiec laczac je w pojedynczy strumien
            //wstawiamy znaki nowej linii
            s = bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
}
