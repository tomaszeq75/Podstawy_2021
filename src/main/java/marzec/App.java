package marzec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {

    public static void main(String[] args) {



    }

    private static void joinerDemo() {
        Joiner_27 <String>joiner_27 = new Joiner_27(", ");
        System.out.println(joiner_27.join("a", "b", "c"));

        Joiner_27<Integer> jInt = new Joiner_27<>("-");
        System.out.println(jInt.join2(11, 22, 33));

        Joiner_27 j27 = new Joiner_27(":");
        System.out.println(j27.join2("aaa", 111, 1.0));
    }

    private static void manufakrurerDemo() {
        Manufacturer_12 man1 = new Manufacturer_12("Man", "PL", 1960);
        Manufacturer_12 man2 = new Manufacturer_12("Iveco", "DE", 1910);
        List<Manufacturer_12> manufakturers = new ArrayList<>();
        manufakturers.add(man1);
        manufakturers.add(man2);

        Manufacturer_12 man3 = new Manufacturer_12("Fiat", "DE", 1950);
        List<Manufacturer_12> manufakturers2 = new ArrayList<>();
        manufakturers2.add(man3);

        Car_12 car = new Car_12("BMW", "3", 100000.0, 2020, EngineType.V8, manufakturers);
        Car_12 car1 = new Car_12("BMW", "7", 200000.0, 2021, EngineType.V12, manufakturers);
        Car_12 car2 = new Car_12("Audi", "A7", 150000.0, 2019, EngineType.V6, manufakturers);
        Car_12 car3 = new Car_12("Renault", "Clio", 70000.0, 2021, EngineType.S4, manufakturers);
        Car_12 car4 = new Car_12("VW", "Golf", 70000.0, 2020, EngineType.S4, manufakturers2);

        CarServis_13 carServis_13 = new CarServis_13();
        carServis_13.addCar(car);
        carServis_13.addCar(car1);
        carServis_13.addCar(car2);
        carServis_13.addCar(car3);
        carServis_13.addCar(car4);

        System.out.println(carServis_13.getCars());
        System.out.println(carServis_13.getCarsByEngine(EngineType.V12));
        System.out.println(carServis_13.getCars());
        System.out.println("most expensive is: " + carServis_13.getMostExpensiveCar());
        System.out.println("less expensive is: " + carServis_13.getLessExpensiveCar());
        System.out.println("produced before " + 2021 + carServis_13.getCarsProducedBefore(2021));
        System.out.println("with 1 manufact "  + carServis_13.getCarsWithXManufacturers(1));

        carServis_13.sort("up");
        System.out.println(carServis_13.getCars());

        System.out.println(carServis_13.getCarsByManufacturer(man3));
    }

    private static void circleResizeDemo() {
        Point2D_9 p1 = new Point2D_9(0, 0);
        Point2D_9 p2 = new Point2D_9(4, 3);

        Circle_9 circle = new Circle_9(p1, p2);

        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());

        circle.resize(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
    }

    private static void circleMoveDemo() {
        Point2D_9 p1 = new Point2D_9(1, 3);
        Point2D_9 p2 = new Point2D_9(4, 3);

        Circle_9 circle = new Circle_9(p1, p2);
        System.out.println(circle.getCenter().getX() + " : " + circle.getCenter().getY());

        circle.move(new MoveDirection_10(5,5));
        System.out.println(circle.getCenter().getX() + " : " + circle.getCenter().getY());
        System.out.println(circle.getCenter());
    }

    private static void circleDemo() {
        Point2D_9 p1 = new Point2D_9(0, 0);
        Point2D_9 p2 = new Point2D_9(4, 3);

        Circle_9 circle = new Circle_9(p1, p2);

        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
    }

    private static void parcelDemo() {
        Parcel p1 = new Parcel(70, 70, 50, 23.0, false);
        Parcel p2 = new Parcel(270, 70, 10, 23.0, true);

        System.out.println("1");
        Validator.validate(p1);
        System.out.println("2");
        Validator.validate(p2);
    }

    private static void magazineDemo() {
        Magazine_7 magazine_7 = new Magazine_7(3);
        magazine_7.shoot();
        magazine_7.loadBullet("aaa");
        magazine_7.loadBullet("aaa");
        magazine_7.loadBullet("aaa");
        magazine_7.loadBullet("aaa");
        magazine_7.shoot();
        magazine_7.shoot();
        magazine_7.shoot();
        magazine_7.shoot();
    }

    private static void sdaHashSetDemo() {
        SDAHashSet_5 sdaHashSet_5 = new SDAHashSet_5();

        System.out.println(sdaHashSet_5.add("A"));
        System.out.println(sdaHashSet_5.add("A"));

        System.out.println(sdaHashSet_5.contains("A"));
        System.out.println(sdaHashSet_5.contains("b"));

        System.out.println(sdaHashSet_5.remove("b"));
        System.out.println(sdaHashSet_5.remove("A"));
    }

    private static void storageDemo() {
        Storage_4 storage_4 = new Storage_4();
        storage_4.addToStorage("aaa", "111");
        storage_4.addToStorage("bbb", "111");
        storage_4.addToStorage("a", "11");

        storage_4.printValues("aaa");

        storage_4.findValues("111a");
    }

}
