package Second_Round.Lec22_5;

public class Visitor<E> {

    public int count = 0;

    public void visit(Baum.Knoten<E> current){
        count++;
    }


}
