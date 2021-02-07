package luty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Child> children= new ArrayList<>();
        Child child = new Child("Ula 123");
        children.add(child);
        children.add(new Child("Tomek 321321"));
        children.add(new Child("Zomek 221321"));
        children.add(new Child("Tomek 221321"));

        System.out.println(children);
        Collections.sort(children);
        System.out.println(children);

        System.out.println(children.contains(new Child("Zomek 221321")));





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
        Vehicle newCar = new NewCar("A3", "VIN");
        Vehicle oldCar = new UsedCar("Astra", "VIN4564654", 2010);

        newCar.go();
        oldCar.stop();

        UsedCar usedCar = new UsedCar("Astra", "VIN4564654", 2010);
        System.out.println(usedCar.getHowOldItIs());
    }
}
