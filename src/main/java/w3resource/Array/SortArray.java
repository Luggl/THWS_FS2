package w3resource.Array;

import Second_Round.Lec22_1.YinYan_InnerClass;
import Second_Round.Lec23_1_2.Yin;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;

public class SortArray {
    public static void main(String[] args) {;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<150; i++){
            numbers.add((int)(Math.random()*43+i));
        }
        numbers.sort(Integer::compareTo);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(13);
        /*Thread t = new Thread(Yin);
        list.stream()
                .forEach(huso -> t.start());

        for(Integer integer : numbers){
            System.out.println(integer);
        }
         */

    }
}
