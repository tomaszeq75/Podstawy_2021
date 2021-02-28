package styczen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zadanie20 zadanie20 = new Zadanie20();
    }

    private static void lookForLongestPoem() {
        Poem[] poems = initianizePoems();

        int longestPoem = 0;
        String nameLongestPoemAuthor = "";
        for (Poem poem : poems) {
            if (poem.getStropheNumbers() > longestPoem) {
                longestPoem = poem.getStropheNumbers();
                nameLongestPoemAuthor = poem.getCreator().getSurname();
            }
        }
        System.out.println("Najdłuższy wiersz napisał: " + nameLongestPoemAuthor);
    }

    private static Poem[] initianizePoems() {
        Poem poem1 = new Poem();
        poem1.setCreator(new Author("Nowak", "Polish"));
        poem1.setStropheNumbers(10);

        Poem poem2 = new Poem(new Author("Smith", "USA"), 20);

        Author author3 = new Author("YangYong", "Japan");
        Poem poem3 = new Poem(author3, 30);

        Poem[] poems = {poem1, poem2, poem3};
        return poems;
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
