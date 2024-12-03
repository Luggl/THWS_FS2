package Klausur2020SS.Aufgabe4;

import Klausur2020SS.Aufgabe3.finList;

import java.io.Serializable;
import java.util.ArrayList;

public class Spieldata implements Serializable {
    private int geld;
    private finList<String> playerIDs;

    @Override
    public String toString(){
        return "Geld: " + geld + "\n";
    }

    private Spieldata(int geld, finList<String> playerIDs){
        this.geld = geld;
        this.playerIDs = playerIDs;
    }
    public static class SpieldataBuilder{
        private int geld;
        private ArrayList<String> playerIDs = new ArrayList<>();

        public SpieldataBuilder geld(int geld){
            this.geld = geld;
            return(this);
        }
        public SpieldataBuilder add(String s){
            playerIDs.add(s);
            return(this);
        }

        public Spieldata build(){
            return(new Spieldata(geld, new finList<>(playerIDs)));
        }

    }

    public static void main(String[] args) {
        Spieldata.SpieldataBuilder builder = new Spieldata.SpieldataBuilder();
        Spieldata daten = builder.geld(1000)
                .add("abc")
                .add("xyz")
                .build();

        System.out.println(daten);
        try{
            daten.playerIDs.add("hello");
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }
}
