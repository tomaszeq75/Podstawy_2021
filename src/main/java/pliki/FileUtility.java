package pliki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileUtility {

    public static void open(Path path) throws IOException {
        System.out.println("\nOpen");
        if (!Files.exists(path)) {
            System.out.println("nie ma takiego pliku: " + path);
            return;
        }
        System.out.println("Zawartość pliku: " + path.toString());
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
    }

    public static void remove(Path path) throws IOException {
        System.out.println("\nRemove");
        if (Files.exists(path)) {
            Files.delete(path);
            System.out.println("File removed: " + path.toString());
        }
    }

    public static void create(Path path, String text) throws IOException {
        System.out.println("\nCreate");
        if (!Files.exists(path)) {
            Files.createFile(path);
            System.out.println("File created: " + path.toString());
            Files.write(path, text.getBytes(), StandardOpenOption.WRITE);
        } else {
            System.out.println("Taki plik już istnieje: " + path.toString());
        }
    }

    public static boolean exists(Path path) {
        System.out.println("\nExist");
        if (Files.exists(path)){
            System.out.println("plik: " + path + " istnieje");
            return true;
        }

        System.out.println("plik: " + path + " nie istnieje");
        return false;
    }
}
