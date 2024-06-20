package First_Round.Lec20_2;

import java.util.ArrayList;
import java.util.Collections;

public class Skat {

    ArrayList<Skatkarten> allCards = new ArrayList<>();
    ColorENUM c;
    ValueENUM v;


    //Karten erzeugen:
    public void getCards() {
        for(ColorENUM e : ColorENUM.values()){
            for(ValueENUM en : ValueENUM.values()){
                allCards.add(new Skatkarten(e, en));
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
        ArrayList<Skatkarten> player = s.getPlayerHand();
        for(Skatkarten x : player){
            System.out.println(x);
        }
    }
}