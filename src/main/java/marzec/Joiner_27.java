package marzec;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joiner_27<T> {
    String separator;

    public Joiner_27(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
        return Arrays.asList(elements).stream()
                .map(e -> e.toString())
                .collect(Collectors.joining(separator));
    }

    public String join2(T... elements) {
        return Arrays.stream(elements)
                .map(Object::toString)
                .collect(Collectors.joining(separator));
    }
}
