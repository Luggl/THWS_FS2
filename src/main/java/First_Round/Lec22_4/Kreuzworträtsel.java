package First_Round.Lec22_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;


public class Kreuzworträtsel {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};


    public static void main(String[] args)
    {
//        TreeSet<String> t = new TreeSet<>(new ComperatorTree());

        Comparator<String> a = new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() < b.length()) {
                    return (-1);
                } else if (a.length() > b.length()) {
                    return (1);
                } else {
                    return (a.compareTo(b));
                }
            }
        };

        TreeSet<String> t = new TreeSet<>(a);

        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
}
