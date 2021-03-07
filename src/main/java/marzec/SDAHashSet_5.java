package marzec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SDAHashSet_5<E>{
    private HashMap<E, Object> map;
    private static final Object OBECNY = new Object();

    public SDAHashSet_5() {
        this.map = new HashMap<>();
    }

    public boolean add(E e) {
        return map.put(e, OBECNY) == null;
    }

    public boolean remove(Object o) {
        return map.remove(o) == OBECNY;
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public Iterator iterator() {
        return map.keySet().iterator();
    }

    public void clear() {
        map.clear();
    }

}
