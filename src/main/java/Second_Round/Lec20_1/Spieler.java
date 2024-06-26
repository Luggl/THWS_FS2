package Second_Round.Lec20_1;

import java.util.ArrayList;

public class Spieler {

    ArrayList<Cards> hand = new ArrayList<>();

    public static void main(String[] args) {
        Cards c = new Cards();
        Spieler s = new Spieler();
        s.hand = c.getHand();
        for(Cards cards : s.hand){
            System.out.println(cards);
        }
    }
}
