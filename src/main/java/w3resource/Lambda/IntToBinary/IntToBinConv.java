package w3resource.Lambda.IntToBinary;

public class IntToBinConv {
    public static void main(String[] args) {
        IntToBin itb = i -> Integer.toBinaryString(i);

        System.out.println(itb.toBinary(-4258));
    }
}
