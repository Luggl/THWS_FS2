package First_Round.Klausurvorbereitung.BaumVisitor;

public class Main {
    public static void main(String[] args) {
        String a = "Faulenzer";
        String b = "Sportler";
        String c = "Finanz-Heini";
        String d = "Trottel";

        Baum<String> baum = new Baum<>();
        baum.einfuegen(a);
        baum.einfuegen(b);
        baum.einfuegen(c);
        baum.einfuegen(d);

        System.out.println(baum.size());

    }
}
