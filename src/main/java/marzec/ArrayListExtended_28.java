package marzec;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExtended_28<E> extends ArrayList<E> {
    public ArrayListExtended_28() {
        super();
    }

    public List<E> getEveryNthElement(int index, int skip) {
        ArrayList<E> arrayList = new ArrayList<>();

        for (int i = index; i < this.size(); i += skip) {
            arrayList.add(this.get(i));
        }
        return arrayList;
    }

    // todo dokończyć
    public List<E> getEveryNthElementStream(int index, int skip) {
        int[] tab = {0};
        List<E> list = new ArrayList<>();

        this.stream()
                .skip(index)
                .forEach(x -> {
                    if (tab[0]++ % skip == 0) {
                        list.add(x);
                    }
                });
        return list;
    }
// todo sprawdzić bo nie do końca działa
    public List<E> getEveryNthElementStream2(int index, int skip) {
        return IntStream.range(0, this.size())
                .filter(i -> (i - index) % (skip + 1) == 0 && i - index >= 0)
                .mapToObj(this::get)
                .collect(Collectors.toList());
    }


}
