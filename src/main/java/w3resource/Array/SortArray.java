package w3resource.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
    public static void main(String[] args) {;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<150; i++){
            numbers.add((int)(Math.random()*43+i));
        }
        numbers.sort(Integer::compareTo);

        for(Integer integer : numbers){
            System.out.println(integer);
        }

    }
}
