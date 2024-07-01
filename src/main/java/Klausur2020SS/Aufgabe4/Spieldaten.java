package Klausur2020SS.Aufgabe4;

import java.sql.Array;
import java.util.ArrayList;

public class Spieldaten {
    private int geld;
    private Klausur2020SS.Aufgabe3.ArrayList<String> spielerIDs = new Klausur2020SS.Aufgabe3.ArrayList<>(new ArrayList<>());

    public int getGeld(){
        return(this.geld);
    }
    public Klausur2020SS.Aufgabe3.ArrayList<String> getSpielerIDs(){
        return(this.spielerIDs);
    }

    private Spieldaten(int geld, ArrayList<String> spielerIDs){
        this.geld = geld;
        this.spielerIDs = new Klausur2020SS.Aufgabe3.ArrayList<>(spielerIDs);
    }

    public static class SpieldatenBuilder{
        private int geld;
        private ArrayList<String> spielerIDs = new ArrayList<>();

        public SpieldatenBuilder add(String id){
            this.spielerIDs.add(id);
            return(this);
        }

        public Spieldaten build(){
            return new Spieldaten(this.geld, this.spielerIDs);
        }

        public SpieldatenBuilder geld(int geld){
            this.geld = geld;
            return(this);
        }
    }

    public static void main(String[] args) {
        Spieldaten.SpieldatenBuilder builder = new Spieldaten.SpieldatenBuilder();
        Spieldaten daten = builder.geld(1000)
                .add("abc")
                .add("xyz")
                .build();

//        daten.getSpielerIDs().add("bla");
    }

}
