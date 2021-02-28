package luty_coding;

import java.util.Objects;

public class Person {
    String name, surname, pesel;

    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && pesel.equals(person.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, pesel);
    }

    @Override
    public String toString() {
        return "[" + name + ' ' + surname + ' ' + pesel + ']';
    }
}
