package zadania0228;

import java.util.Locale;
import java.util.Objects;

public class Person implements Comparable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name.toLowerCase(), person.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Object o) {
        Person personToCompare;
        if (o instanceof Person) {
            personToCompare = (Person) o;
        } else{ return 0;}
        return this.name.toLowerCase().compareTo(personToCompare.name.toLowerCase());
    }
}
