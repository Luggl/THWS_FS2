package Klausur2020SS.Viereck;

import java.util.TreeSet;

public class Viereck {
    TreeSet<Punkt> Punkte = new TreeSet<>();

    public Viereck(Punkt ... punkte){
        for(Punkt p : punkte){
            Punkte.add(p);
        }
        if(Punkte.size() != 4){
            throw new RuntimeException("Keine vier unterschiedlichen Punkte");
        }
    }

    public static void main(String[] args) {
        Punkt a = new Punkt(1,1);
        Punkt b = new Punkt(1,-1);
        Punkt c = new Punkt(-1,3);
        Punkt d = new Punkt(2,5);
        Viereck v = new Viereck(a,b,c,d);
        for(Punkt p : v.Punkte){
            System.out.println(p);
        }
    }
}
