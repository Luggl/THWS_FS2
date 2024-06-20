package First_Round.Lec15_3;

public class Textfrage extends Frage {

    public Textfrage(String frage){
        super(frage);
    }


    @Override
    public String toString(){
        String out = frage + "\n\nAntwort:\n____________\n\n\n";
        return(out);
    }

}
