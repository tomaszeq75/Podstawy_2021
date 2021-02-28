package luty_coding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //Tworzymy set
        Set<String> set = new HashSet<>();

        //Dodajemy element do setu i jednosczenie metoda zwraca informacje, czy udalo sie dodac obiekt
        System.out.println("dodaje Piotr "  + set.add("Piotr"));
        System.out.println("dodaje Adam "  + set.add("Adam"));
        System.out.println("dodaje Piotr "  + set.add("Piotr"));

        //wyswietlamy ilosc elementow
        System.out.println(set.size());

        //usuwamy element
//        set.remove("Piotr");

        //sprawdzamy, czy element znajduje sie w secie
        System.out.println(set.contains("Adam"));

        //iterujemy sie
        Iterator<String> iterator = set.iterator();
        System.out.println("Iterator");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}