package Lec20_1;

import com.sun.security.jgss.GSSUtil;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class MauMau {
    ArrayList<Cards> CardsList = new ArrayList<>();
    // Erlaubte Karten:
    String[] values = {"Bube", "Dame", "König", "Ass"};
    String[] colors = {"Herz", "Pik", "Kreuz", "Karo"};

    //Karten erzeugen:
    public void getCards(){
        for(int i = 2; i<=10; i++){
            for(String s : colors){
                CardsList.add(new Cards(s, String.valueOf(i)));
            }
        }
        for(String s : values){
            for(String f : colors){
                CardsList.add(new Cards(f, s));
            }
        }
    }

    public void shuffleCards(){
        Collections.shuffle(CardsList);
    }

    public Cards[] getPlayerHand(){
        Cards[] out = new Cards[5];
        for(int i = 0; i<out.length; i++){
            out[i] = CardsList.remove(i);
        }
        return(out);
    }

    public static void main(String[] args) {
        MauMau m = new MauMau();
        m.getCards();
        m.shuffleCards();
        Cards[] hand = m.getPlayerHand();
        for(Cards c : hand){
            System.out.println(c.getColor() + "\t\t" + c.getValue());
        }
    }
}
