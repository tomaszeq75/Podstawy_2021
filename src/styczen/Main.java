package styczen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zadanie15 zadanie15 = new Zadanie15();
    }

    private static void dateTimeExample() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy___mm___dd");
        System.out.println(localDateTime.format(dateFormatter));

        LocalDate today = LocalDate.now();
        LocalDate endOfTask = LocalDate.of(2021, 02, 01);

        if (endOfTask.isAfter(today)) {
            System.out.println("masz jeszcze czas");
        } else System.out.println("Po czasie");

        //obliczanie czsu pomiędzy datami
        Period daysToEnd = Period.between(today, endOfTask);
        System.out.println(daysToEnd);

        //parsowanie
        String holiday = "2021-07-01 00:00";
        DateTimeFormatter holidayFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime holidayDateTime = LocalDateTime.parse(holiday, holidayFormatter);
        System.out.println("wakacje: " + holidayDateTime);
    }

    private static void outerInnerTest() {
        OuterClass.InnerStaticClass.printStatic();
        OuterClass outerClassObj = new OuterClass();

        // tworzenie klasy wewn. statycznej
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        innerStaticClass.print();
        innerStaticClass.printStatic();

        // tworzenie klasy wewn. niestatycznej
        OuterClass.InnerRegularClass innerRegularClass = outerClassObj.new InnerRegularClass();
    }

    private static void staticClaculatorTest() {
        int a, b, wynik = 0;
        String dzialanie;

        Scanner in = new Scanner(System.in);
        System.out.println("podaj 2 liczby");
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("podaj działanie (+,-,*,/,%)");
        dzialanie = in.next();
        switch (dzialanie) {
            case "+":
                wynik = StaticCalculator.add(a, b);
                break;
            case "-":
                wynik = StaticCalculator.subtract(a, b);
                break;
            case "*":
                wynik = StaticCalculator.multiply(a, b);
                break;
            case "/":
                wynik = StaticCalculator.divide(a, b);
                break;
            case "%":
                wynik = StaticCalculator.modulo(a, b);
                break;
            default:
                System.out.println("nie ma takiego działania");
        }

        System.out.println(wynik);
    }
}
