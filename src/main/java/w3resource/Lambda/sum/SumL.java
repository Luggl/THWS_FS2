package w3resource.Lambda.sum;

public class SumL {
    public static void main(String[] args) {
        SumLambda s = (x, y) -> x + y;

        int result = s.sum(6, 5);
        System.out.println(result);
    }
}
