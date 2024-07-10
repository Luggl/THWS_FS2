package w3resource.stream;

import java.util.*;

public class Max {
    static Integer[] numbers = new Integer[]{5, 12, 36, 4, 8, 9, 145, 69, 6969, 1337};

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(numbers);
//
//        double average = list.stream()
//                .mapToDouble(Integer::doubleValue)
//                .average()
//                .orElse(0.0);
//
//        System.out.println(average);

        String[] strings = new String[]{"Bitte", "helfen", "Sie", "mir", "-", "Ich", "habe", "verdammte", "schmerzen"};
        List<String> stringList = Arrays.asList(strings);
        List<String> stringListUpper = stringList.stream()
                .map(String::toUpperCase).toList();

        for(String s : stringListUpper){
            System.out.println(s);
        }
    }
}
