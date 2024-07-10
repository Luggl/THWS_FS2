package w3resource.Lambda.UpperLower;

public class Conv {
    public static void main(String[] args) {
        UpperConverter upper = (string) -> string.toUpperCase();
        LowerConverter lower = (string) -> string.toLowerCase();

        System.out.println(upper.toUpper("hello World"));
        System.out.println(lower.toLower("HeLlO wOrLd"));
    }
}
