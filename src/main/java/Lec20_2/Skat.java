package Lec20_2;

import Lec20_1.Cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Skat {

    ArrayList<Skatkarten> allCards = new ArrayList<>();
    String[] colors = {"Herz", "Pik", "Kreuz", "Karo"};

    //Karten erzeugen:
    public void getCards() {
        for (int i = 2; i <= 14; i++) {
            for (String s : colors) {
         //       allCards.add(new Skatkarten(ColorENUM.name(s)), i);
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(allCards);
    }

    public ArrayList<Skatkarten> getPlayerHand() {
        ArrayList<Skatkarten> out = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            out.add(allCards.removeFirst());
        }
        Collections.sort(out);
        return (out);
    }

    public static void main(String[] args) {
        Skat s = new Skat();
        s.getCards();
        s.shuffleCards();
        s.shuffleCards();
        for(Skatkarten x : s.getPlayerHand()){
            System.out.println(s);
        }
    }
}