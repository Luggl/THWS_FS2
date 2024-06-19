package Lec23_2;

import java.util.Arrays;
import java.util.List;
public class Comparator {
        static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
                "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};


        public static void main(String[] args) {
            List<String> list = Arrays.asList(alleWoerter);
            list.stream()
                    .sorted(new java.util.Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            if(o1.length() < o2.length()){
                                return(-1);
                            }else if(o1.length() > o2.length()){
                                return(1);
                            }else{
                                return(0);
                            }
                        }
                    })
                    .forEach(string -> System.out.println(string));
        }
    }
