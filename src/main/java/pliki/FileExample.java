package pliki;

import java.io.IOException;
import java.nio.file.*;

public class FileExample {

    public static void main(String[] args) throws IOException {

        //nazwa pliku
        Path path = Paths.get("data.txt");
        Path pathToCopy = Paths.get("copy.txt");

        if (Files.exists(path)) {
            Files.delete(path);
        }

//        try{
        Files.createFile(path);
//        } catch (FileAlreadyExistsException e){
//            System.out.println("Plik istnieje dlatego nie udalo sie go stworzyc");
//        }

        Files.write(path, "dane do pliku linijka 1\n".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "dane do pliku linijka 2\n".getBytes(), StandardOpenOption.APPEND);

        for (String linijka : Files.readAllLines(path)) {
            System.out.println(linijka);
        }

        //kopiowanie pliku do pliku
//        Files.copy(path, pathToCopy);

    }
}