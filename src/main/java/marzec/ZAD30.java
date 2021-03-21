package marzec;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collectors;

public class ZAD30 {
    public static void main(String[] args) {

        String text = new StringBuilder()
                .append("jakiś tekst")
                .append("\n")
                .append("jakiś tekst2")
                .toString();

        String path = "C:\\Users\\twoly\\Documents\\SDA_Projects\\Podstawy_2021\\plik.txt";
        creteFile(path, text);

        readFile(path);

        reverseFile(path);
    }

    public static void reverseFile(String pathAsString) {
        Path path = Paths.get(pathAsString);
        String folder = path.getParent().toString();
        String fullFileName = path.getFileName().toString();

        String fileName = fullFileName.substring(0, fullFileName.lastIndexOf('.'));
        String fileExtension = fullFileName.substring(fullFileName.lastIndexOf('.'));

        String outputFilePath = folder + "\\"+ new StringBuilder(fileName).reverse().toString() + fileExtension;

        String inputText = readFile(pathAsString);
        System.out.println(inputText);

        // todo reverse zawartość

    }

    public static void creteFile(String path, String text) {
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.println("File created");
        } catch (IOException e) {
            e.printStackTrace();
        }

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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
