package marzec;

import java.util.*;

public class Storage_4 {

    private Map<String, List<String>> map;

    public Storage_4() {
        this.map = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        }
        map.put(key, new ArrayList<String>(Arrays.asList(value)));
        //niemutowalna
//        map.put(key, Arrays.asList(value));
        // todo sprawdzić w debuggerze
    }

    public void printValues(String key) {
        System.out.println(map.get(key));
    }

    public void findValues(String value) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
