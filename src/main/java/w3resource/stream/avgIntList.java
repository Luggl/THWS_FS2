package w3resource.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class avgIntList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 18, 4, 68, 12, 5, 79, 69);
        double avg = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(avg);
    }

}
