package zadania0228;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonList {

    List<Person> persons = new ArrayList<>();

    public void add(String name) {
        add(new Person(name));
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean remove(String name) {
        return persons.remove(new Person(name));
    }

    public boolean remove(Person person) {
        return persons.remove(person);
    }

    public int removaAll(String name) {
        return removaAll(new Person(name));
    }

    public int removaAll(Person person) {
        int counter = 0;
        while (persons.contains(person)) {
            persons.remove(person);
            counter++;
        }
        return counter;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void print() {
        persons.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(persons);
    }
}
