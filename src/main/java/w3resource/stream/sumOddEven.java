package w3resource.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class sumOddEven {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 79, 15, 45, 46, 42, 18, 153, 6873, 18487, 54657, 1613, 2154, 214424);

        AtomicInteger sumEven = new AtomicInteger();
            numbers.stream()
            .filter(new Predicate<Integer>() {
                @Override
                public boolean test(Integer integer) {
                    return(integer % 2 == 0);
                }
            })
            .forEach(i -> sumEven.addAndGet(i));

        System.out.println(sumEven);
    }
}
