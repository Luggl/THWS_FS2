package Second_Round.Lec22_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel {
    static String[] alleWoerter = {"Denis","Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    public static class TreeComp implements Comparator<String> {
        @Override
        public int compare(String s1, String s2){
            if(s1.length() > s2.length()){
                return(1);
            }else if (s1.length() < s2.length()){
                return(-1);
            }else{
                return(s1.compareTo(s2));
            }

        }
    }

    public static void main(String[] args)
    {
//        TreeSet<String> t = new TreeSet<>(new TreeComp());
        TreeSet<String> t = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return(1);
                }else if(o1.length() < o2.length()){
                    return(-1);
                }else{
                    return(o1.compareTo(o2));
                }
            }
        });
        t.addAll(Arrays.asList(alleWoerter));
        for(String wort : t)
            System.out.println(wort);
    }
}
