package Lec17_1;

public class OutOfMemory {
    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b = new int[]{1, 4, 5, 6, 7};

        a = b;

        System.out.println(a);
    }
}
