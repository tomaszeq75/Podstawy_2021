package personList;

import java.util.Collections;

public class App {
    public static void main(String[] args) {
        PersonByNamesRepository personByNamesRepository = new PersonByNamesRepository();

        personByNamesRepository.addPerson("Jan", "Kowalski");
        personByNamesRepository.addPerson("Jan", "Nowak");
        personByNamesRepository.addPerson("Jarosław", "Kowalski");
        personByNamesRepository.addPerson("Marek", "Kowalski");

        System.out.println(personByNamesRepository.getPersonListByName("Jan"));
        System.out.println(personByNamesRepository.getPersonListByName("Jarosław"));
        System.out.println(personByNamesRepository.getPersonListByName("Jaro"));

        System.out.println(personByNamesRepository.getNamesOfSurname("Kowalski"));

        personByNamesRepository.print();

    }
}
