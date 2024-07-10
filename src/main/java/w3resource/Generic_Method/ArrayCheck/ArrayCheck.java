package w3resource.Generic_Method.ArrayCheck;

import java.util.ArrayList;

public class ArrayCheck {

    public static <T> boolean checkArray(T[] a, T[] b){
        if(a.length != b.length){
            return (false);
        }else{
            for(int i = 0; i<a.length; i++){
                if(a[i] != b[i]){
                    return(false);
                }
            }
        }
        return(true);
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 5, 6, 8, 9};
        Integer[]b = new Integer[]{1, 2, 5, 6, 8, 9};
        Integer[]c = new Integer[]{1, 3, 5, 7, 8, 9};
        String[] d = new String[]{"Hello", "World", "Käsekuchen"};
        String[] e = new String[]{"Hello", "World", "Käsekuchen"};

        System.out.println(checkArray(a, b));
        System.out.println(checkArray(a, c));
        System.out.println(checkArray(d, e));


     }

}
