package First_Round.Lec17_1;

import java.util.ArrayList;

public class OutOfMemory {
    public static void main(String[] args) {
        int[] a = new int[999999999];
        int[] b = new int[999999999];
        int[] c = new int[a.length + b.length];

        System.out.println(c);
    }
}
