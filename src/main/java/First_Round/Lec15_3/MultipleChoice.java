package First_Round.Lec15_3;

public class MultipleChoice extends Frage{

    public MultipleChoice(String frage){
        super(frage);
            }

    @Override
    public String toString(){
        String out = frage + "\n\nAntwortmöglichkeiten:\nA: 4\nB: 2\nC: 1\nD: 0\n\n\n";
        return (out);
    }

}
