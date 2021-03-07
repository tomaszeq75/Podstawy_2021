package marzec;

import java.util.Map;
import java.util.TreeMap;

public class Zad6 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("a", 1);
        treeMap.put("b", 2);
        treeMap.put("c", 2);
        treeMap.put("d", 4);

        printFirstAndLast(treeMap);
        printFirstAndLastWithGenerics(treeMap);
    }

    public static <K, V extends Number> void printFirstAndLastWithGenerics(TreeMap<K, V> treemap) {
        System.out.println(treemap.firstEntry().getKey() + " : " + treemap.firstEntry().getValue());
        System.out.println(treemap.lastEntry().getKey() + " : " + treemap.lastEntry().getValue());
    }

    public static void printFirstAndLast(TreeMap<String, Integer> treemap) {
        System.out.println(treemap.firstEntry().getKey() + " : " + treemap.firstEntry().getValue());
        System.out.println(treemap.lastEntry().getKey() + " : " + treemap.lastEntry().getValue());
    }
}
