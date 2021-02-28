package luty_coding;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addToStorage("1", "aaa");
        storage.addToStorage("1", "bbb");
        storage.addToStorage("2", "ccc");
        storage.addToStorage("2", "ddd");

        storage.printValues("1");
        System.out.println();

        storage.printAllValues();
    }

    private static void basketDemo() {
        Basket basket = new Basket();
        Product p1 = new Product("aaa", "1", 20.0);
        Product p2 = new Product("bbb", "2", 10.0);
        Product p3 = new Product("ccc", "3", 5.0);
        Product p4 = new Product("aaa", "1", 20.0);

        System.out.println(basket.add(p1));
        System.out.println(basket.add(p2));
        System.out.println(basket.add(p3));
        System.out.println(basket.add(p4));

        basket.show();

        basket.remove(new Product("a", "2", 7));
        basket.show();

        basket.remove("3");
        basket.show();
    }

    private static void guestListDemo() {
        GuestList guestList = new GuestList();

        Scanner in = new Scanner(System.in);

        String name;

        System.out.println("podaj imię gościa (exit - wyjście, lista - wyświetla listę)");
        while (true) {
            name = in.nextLine();
            if ("exit".equals(name)) {
                guestList.show();
                System.exit(0);
            }
            if ("lista".equals(name)) {
                guestList.show();
                continue;
            }
            if (guestList.add(name)) {
                System.out.println("dodano do bazy");
            } else {
                System.out.println("jest już na liście");
            }
        }
    }

    private static void zadanie1() {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("Adam" , "Duda", "777");
        Person p2 = new Person("Adam" , "Duda", "888");
        Person p3 = new Person("Adam" , "Duda", "777");

        persons.addAll(Arrays.asList(p1, p2, p3));
        System.out.println(persons);

        Set<Person> personSet = new HashSet<>();
        for (Person person : persons) {
            personSet.add(person);
        }
        System.out.println(personSet);
    }

    private static void carDemo() {
        Car car = new Car(10, 50);
        System.out.println(car.getRange());
    }

    private static void innerClassDemo() {
        int[] numbers = {3, 4, 5, 1};
        OuterKlasa obj = new OuterKlasa(numbers);
        obj.analyzeNumbers();

//        OuterKlasa.InnerKlasa innerClass = obj.new InnerKlasa();
//        System.out.println(innerClass.avg());
    }

}
