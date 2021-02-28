package luty_coding;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GuestList implements GuestListInterface{

    Set<String> guests = new HashSet<>();

    @Override
    public boolean add(String s) {
        if (s.isBlank()) return false;
        return guests.add(s);
    }

    @Override
    public void show() {
        Iterator iterator = guests.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
