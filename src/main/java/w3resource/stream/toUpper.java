package w3resource.stream;

import java.util.ArrayList;
import java.util.List;

public class toUpper {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("Mein Knie tut weh");
        strings.add("Gott ist mir schwindelig");

        strings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        strings.stream()
                .map(s -> s.toLowerCase())
                .forEach(s -> System.out.println(s));

    }
}
