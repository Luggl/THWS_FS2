package w3resource.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arr {
    static int[] arr = new int[]{1, 5, 8, 9, 4, 6, 3, 12};
    static List<Integer> list = new ArrayList<>();


    public static void main(String[] args) {
        createList();
        System.out.println(list);
        deleteStuff();
        System.out.println(list);

    }
    public static void createList(){
        for(Integer i : arr){
            list.add(i);
        }
    }

    public static void deleteStuff(){
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next() <= 8){
                it.remove();
            }
        }
    }
//    @Override
//    public String toString(){
//        String out = "";
//        for(Integer i : list){
//            out += i + " - ";
//        }
//        return(out);
//    }


}
