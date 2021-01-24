package styczen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FibonacciNumber {
    Scanner in = new Scanner(System.in);
    int fibNumber = 1;
    File file;

    FibonacciNumber() {
        int number = in.nextInt();
        writeToFile(fib(number));
        System.out.println(fib(number));
    }

    public int fib(int number) {
        if (number < 3) {
            return 1;
        }
        return fib(number - 1) + fib(number - 2);
    }



    public void writeToFile(int value) {
        file = new File("fib.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(String.valueOf(value) + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
