package Second_Round.Lec20_1;

import java.util.ArrayList;

public class Cards {
    ArrayList<Cards> deck = new ArrayList<>();
    String farbe;
    int value;
    String[] farben = new String[]{"Herz", "Pik", "Karo", "Kreuz"};
    int[] values = new int[]{7, 8, 9, 10, 11, 12, 13, 14};

    public Cards(){
        for(String s : farben){
            for(int v : values){
                deck.add(new Cards(s, v));
            }
        }

    }
    private Cards(String farbe, int value){
        this.farbe = farbe;
        this.value = value;
    }

    public ArrayList<Cards> getHand(){
        ArrayList<Cards> out = new ArrayList<>();
        for(int i = 0; i< 6; i++) {
            out.add(deck.remove((int) (Math.random() * deck.size())));
        }

        return(out);
    }

    @Override
    public String toString(){
        String out = this.farbe +"\t" +  this.value;
        return(out);
    }

}
