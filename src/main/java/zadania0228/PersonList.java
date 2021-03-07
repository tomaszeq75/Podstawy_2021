package zadania0228;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonList {

    List<Person> people;
    int size;

    public PersonList(int size) {
        this.size = size;
        people = new ArrayList<>(size);
    }

    private String capitalizeFirstLetter(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void add(String name) {
        if (name == null || name.isBlank() || isRepositoryFull()) {
            System.out.println("Name in not valid of repo is full");
            return;
        }

        add(new Person(capitalizeFirstLetter(name)));
    }

    public void add(Person person) {
        people.add(person);
    }

    public boolean remove(String name) {
        return people.remove(new Person(capitalizeFirstLetter(name)));
    }

    public boolean remove(Person person) {
        return people.remove(person);
    }

    public int removaAll(String name) {
        return removaAll(new Person(capitalizeFirstLetter(name)));
    }

    public int removaAll(Person person) {
        int counter = 0;
        while (people.contains(person)) {
            people.remove(person);
            counter++;
        }
        return counter;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void print() {
        people.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(people);
    }

    private boolean isRepositoryFull() {
        return people.size() == size;
    }
}
