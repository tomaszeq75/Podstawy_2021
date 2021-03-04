package zadania0228;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        PersonList personList = new PersonList();
        personList.add("Adam");
        personList.add("Zorro");
        personList.add("Jarek");
        personList.add("Tomasz");
        personList.add("Paweł");
        personList.add("Adam");
        personList.add("adam");

        personList.print();

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj imię do usunięcia");
        String nameToRemove = in.next();


        String choise;
        do {
            System.out.printf("Czy usunąć wszystkie osoby z imieniem: %s? [t/n]\n", nameToRemove);
            choise = in.next();
        } while (!("t".equals(choise) || "n".equals(choise)));

        if ("t".equals(choise)) {
            int removed = personList.removaAll(nameToRemove);
            System.out.printf("Usunięto %d osób o imieniu %s\n", removed, nameToRemove);
        } else {
            if (personList.remove(nameToRemove)) {
                System.out.println("Usunięto 1 osobę o imieniu " + nameToRemove);
            } else System.out.println("Nie ma na liście osoby o imieniu: " + nameToRemove);
        }

        personList.print();
        personList.sort();

        System.out.println("\nPo sotrowaniu:");
        personList.print();

    }
}
