package w3resource.Lambda.StringEmpty;

public class Checker {
    public static void main(String[] args) {
        StringCheck s = (string) -> string.isEmpty();

        System.out.println(s.check("This is not empty"));
        System.out.println(s.check(""));
    }
}
