package zadania0222;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        basketDemo();
    }

    private static void basketDemo() {
        Basket basket = new Basket(9);
        try {
            basket.addToBasket();
            basket.addToBasket();
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

        Basket basket2 = new Basket(1);
        try {
            basket2.removeFromBasket();
            basket2.removeFromBasket();
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void threadsDemo() throws InterruptedException {
        Thread thread = new MyThread("th", 100);
        thread.start();

        Thread thread2 = new MyThread("th --", 300);
        thread2.start();

        Thread thread3 = new Thread(new MyRunnable("th ----", 500));
        thread3.start();

        thread.join();
        System.out.println("koniec wątku 1");

        thread2.join();
        System.out.println("koniec wątku 2");

        thread3.join();
        System.out.println("koniec programu");
    }

    private static void computerDemo() {
        Computer c1 = new Computer("Intel", "GeForce", "Dell", "1", 16, 2400);
        Computer c2 = new Computer("AMD", "GeForce", "Dell", "2", 8, 3000);
        Computer c3 = new Computer("AMD", "GeForce", "Dell", "3", 8, 2800);
        Computer c4 = new Computer("AMD", "GeForce", "Dell", "4", 16, 3000);
        Computer c5 = new Computer("AMD", "GeForce", "Dell", "5", 8, 2400);
        Computer c6 = new Computer("AMD", "GeForce", "Dell", "6", 16, 2400);
        System.out.println();

        List<Computer> computers = Arrays.asList(c1, c2, c3, c4, c5, c6);
        System.out.println(computers);

        Collections.sort(computers);
        System.out.println(computers);

        Laptop laptop = new Laptop("AMD", "GeForce", "Dell", "2", 8, 3000, 5000);
        System.out.println("--------------");
        System.out.println(laptop);
    }

    private static void sortListZADemo() {
        List<String> strings = Arrays.asList(new String[]{"aAA", "bbb", "aaa", "Aaa", "ccc", "Ddd"});
        System.out.println(strings);

        SortListZA.sortZA(strings);
        System.out.println(strings);

        SortListZA.sortZAIgnoreCase(strings);
        System.out.println(strings);
    }


}
