package marzec;

import java.util.Arrays;

public class ZAD28 {
    public static void main(String[] args) {
        ArrayListExtended_28<String> arrayListExtended_28 = new ArrayListExtended_28<>();
        arrayListExtended_28.add("1");
        arrayListExtended_28.add("2");
        arrayListExtended_28.add("3");
        arrayListExtended_28.add("4");
        arrayListExtended_28.add("5");
        arrayListExtended_28.add("6");
        arrayListExtended_28.add("7");
        arrayListExtended_28.add("8");
        arrayListExtended_28.add("9");
        arrayListExtended_28.add("10");
        arrayListExtended_28.add("11");
        arrayListExtended_28.add("12");

        System.out.println(arrayListExtended_28.getEveryNthElement(3,2));
        System.out.println(arrayListExtended_28.getEveryNthElementStream(3,2));
        // todo sprawdzić
        System.out.println(arrayListExtended_28.getEveryNthElementStream2(3,2));


    }
}

