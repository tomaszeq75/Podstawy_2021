package marzec;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class ZAD30 {
    public static void main(String[] args) {

        String text = new StringBuilder()
                .append("jakiś tekst")
                .append("\n")
                .append("jakiś tekst2")
                .toString();

//        String path = "C:\\Users\\twoly\\Documents\\SDA_Projects\\Podstawy_2021\\plik.txt";
        String path = "C:\\Users\\Tomek\\IdeaProjects\\Podstawy_2021\\plik.txt";
        creteFileAndWrite(path, text);

        readFile(path);

        creteFileAndWrite(reverseFileName(path), reverseContent(readFile(path)));
    }

    public static String reverseFileName(String pathAsString) {
        Path path = Paths.get(pathAsString);
        String folder = path.getParent().toString();
        String fullFileName = path.getFileName().toString();

        String fileName = fullFileName.substring(0, fullFileName.lastIndexOf('.'));
        String fileExtension = fullFileName.substring(fullFileName.lastIndexOf('.'));

        String outputFilePath = folder + "\\"+ new StringBuilder(fileName).reverse().toString() + fileExtension;

        String inputText = readFile(pathAsString);
        System.out.println(inputText);
        return outputFilePath;
    }

    public static String reverseContentStreamBuilder(String content) {
        String result = new StringBuilder(content).reverse().toString();
        System.out.println("\n" + result);
        return result;
    }

    public static String reverseContent(String content) {
        String result = "";
        for (int i = content.length() - 1; i >= 0; i--) {
            result += content.charAt(i);
        }
        System.out.println("\n" + result);
        return result;
    }

    public static void creteFileAndWrite(String path, String text) {
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.println("File created");
        } catch (IOException e) {
            e.printStackTrace();
        }

        writeToFile(path, text);
    }

    private static void writeToFile(String path, String text) {
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(text);
            System.out.println("Text written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String path) {
        File file = new File(path);
        String result = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            result = bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
