package stream_lambda;

import java.util.Objects;
import java.util.regex.Pattern;

public class Child implements Comparable<Child> {

    private String name;
    private String pesel;

    public Child(String name, String pesel) {
        if (name == null || !isValid(name) || pesel == null) {
            String message = "Not valid arguments: name - %s pesel - %s";
            throw new IllegalArgumentException(String.format(message, name, pesel));
        }
        this.name = name;
        this.pesel = pesel;
    }

    public Child(String child) {
        String[] data = child.split(" ");
        if (data.length != 2) {
            throw new IllegalArgumentException("Not valid arguments!");
        }
        String name = data[0];
        String pesel = data[1];
        if (name == null || !isValid(name) || pesel == null) {
            String message = "Not valid arguments: name - %s pesel - %s";
            throw new IllegalArgumentException(String.format(message, name, pesel));
        }
        this.name = name;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }

    private boolean isValid(String child) {
        if (child == null || child.isBlank()) {
            return false;
        }
        Pattern pattern = Pattern.compile("[a-z A-Z]+");
        return pattern.matcher(child).matches();
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    @Override
    public int compareTo(Child o) {
        int result = name.compareTo(o.name);
        if (result == 0) {
            int peselToCompare = Integer.valueOf(pesel);
            int secondPeslToCompare = Integer.valueOf(o.pesel);
            return Integer.compare(peselToCompare, secondPeslToCompare);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return name.equals(child.name) && pesel.equals(child.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel);
    }
}