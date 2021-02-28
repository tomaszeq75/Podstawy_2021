package pliki;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("plik.txt");

        System.out.println(FileUtility.exists(path));
        FileUtility.open(path);
        FileUtility.create(path, "jakiś tekst");
        FileUtility.exists(path);

        FileUtility.create(path, "jakiś tekst");
        FileUtility.remove(path);
        FileUtility.open(path);
    }
}
