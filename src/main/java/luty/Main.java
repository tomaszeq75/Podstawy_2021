package luty;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket(9);
        try {
            basket.addToBasket();
            basket.addToBasket();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Basket basket2 = new Basket(1);
        try {
            basket2.removeFromBasket();
            basket2.removeFromBasket();
        } catch (BasketEmptyException e) {
            e.printStackTrace();
        }
    }

    private static void carEnumDemo() {
        CarEnum c1 = CarEnum.BMW;
        CarEnum c2 = CarEnum.OPEL;
        CarEnum c3 = CarEnum.TOYOTA;
        System.out.println(c1.isFasterThan(c2));
        System.out.println(c1.isFasterThan(c3));
        System.out.println(c3.isFasterThan(c2));

        System.out.println(CarEnum.FERRARI.isFasterThan(CarEnum.BMW));
    }

    private static void busDemo() {
        Bus b1 = new Bus("autobus", 35);
        Bus b2 = new Bus("autobus", 45);
        Bus b3 = new Bus("autobus", 25);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.compareTo(b2));


        List<Bus> busses = Arrays.asList(b1, b2, b3);

        Collections.sort(busses);
        System.out.println(busses);
    }

    private static void isPrimeValidatorDemo() {
        for (int i = 0; i < 4; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbę");
            System.out.println(IsPrimeValidator.isPrime(in.nextInt()));
        }
    }

    private static int letters(String text, char[] chars) {
        int counter = 0;
        for (char ch : chars) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static void childrenWithString() {
        IChildren childrenRepo = new ListOfChildren();

        childrenRepo.add("jan");
        childrenRepo.add("jan");
        childrenRepo.add("Jola");
        childrenRepo.add("Jola");
        childrenRepo.add("jan");

        childrenRepo.sort();
        System.out.println(childrenRepo.getChildren());
        childrenRepo.clearDuplicates();
        System.out.println(childrenRepo.getChildren());

        System.out.println();
        childrenRepo.namesToUpperCase();
        System.out.println(childrenRepo.getChildren());

        System.out.println();
        childrenRepo.namesToLowerCase();
        System.out.println(childrenRepo.getChildren());
    }

    private static void vehicleInterface() {
        IVehicle newCar = new NewCar("A3", "VIN");
        IVehicle oldCar = new UsedCar("Astra", "VIN4564654", 2010);

        newCar.go();
        oldCar.stop();

        UsedCar usedCar = new UsedCar("Astra", "VIN4564654", 2010);
        System.out.println(usedCar.getHowOldItIs());
    }
}
