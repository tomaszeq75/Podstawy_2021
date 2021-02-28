package luty;

import java.util.Objects;

public class Child implements Comparable<Child>{
    private String name;
    private String pesel;

    public Child(String nameAndPesel) {
        if (isDataValid(nameAndPesel)) {
            String[] tempData = nameAndPesel.split(" ");
            this.name = tempData[0];
            this.pesel = tempData[1];
        } else {
            String message = "Not valid argument: %s";
            throw new IllegalArgumentException(String.format(message, nameAndPesel));
        }
    }

    private boolean isDataValid(String data) {
        String[] nameAndPesel = data.split(" ");

        // inna wersja ify poniżej zastąpione tym - cięzko taki zapis debugować
        return nameAndPesel.length == 2
                && isNameValid(nameAndPesel[0])
                && isPeselValid(nameAndPesel[1]);

//        if (nameAndPesel.length != 2) {
//            return false;
//        }
//
//        if (!isNameValid(nameAndPesel[0])) {
//            return false;
//        }
//
//        if (!isPeselValid(nameAndPesel[1])) {
//            return false;
//        }
//        return true;
    }

    private boolean isPeselValid(String s) {
        // todo
        return true;
    }

    private boolean isNameValid(String name) {
        if (name == null || name.isBlank()) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isAlphabetic(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    @Override
    public int compareTo(Child child) {
        int result = this.name.compareTo(child.name);
        if (result == 0) {
            return this.pesel.compareTo(child.pesel);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return this.name.equals(child.name) &&
                this.pesel.equals(child.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel);
    }
}
