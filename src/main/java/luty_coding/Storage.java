package luty_coding;

import java.util.*;

public class Storage {
    Map<String, List<String>> itemsMap = new HashMap<>();

    void addToStorage(String key, String value) {
        List<String> items = new ArrayList<>();

        if (itemsMap.containsKey(key)) {
            items = itemsMap.get(key);
            items.add(value);
        } else {
            items.add(value);
        }

        itemsMap.put(key, items);
    }

    void printValues(String key) {
        System.out.println(itemsMap.get(key));
    }

    void findValues(String value) {
        List<String> tempKeys = new ArrayList<>();
        Iterator<Map.Entry<String, List<String>>> iterator = itemsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> entry = iterator.next();
            List<String> lista = entry.getValue();
            continue;
        }

    }

    void printAllValues() {
        for (Map.Entry<String, List<String>> item :itemsMap.entrySet()) {
            String key = item.getKey();
            List<String> values = item.getValue();
            for (String value : values) {
                System.out.println(key + " " + value);
            }
        }
    }


}
