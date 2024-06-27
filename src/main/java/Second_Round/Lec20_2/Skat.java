package Second_Round.Lec20_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Skat {

    ArrayList<Card> deck = new ArrayList<>();

    public Skat(){
        for(Color color : Color.values()){
            for(Value value : Value.values()){
                deck.add(new Card(color, value));
            }
        }
    }

    public ArrayList<Card> getPlayerHand(){
        ArrayList<Card> playerHand = new ArrayList<>();
        for(int i = 0; i< 5; i++){
            playerHand.add(deck.remove((int) (Math.random() * deck.size())));
        }
        return(playerHand);
    }


    public static void main(String[] args) {
        Skat skat = new Skat();
        ArrayList<Card> myHand = skat.getPlayerHand();
        for(Card card:myHand){
            System.out.println(card);
        }

        Collections.sort(myHand);

        System.out.println("________________");

        for(Card card : myHand){
            System.out.println(card);
        }
    }


}
