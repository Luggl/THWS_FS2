package First_Round.Klausurvorbereitung.BaumVisitor;

public class GrafZahl<T> implements Visitor<T>{
    public int count;
    public void visit(Baum.Knoten<T> current){
        count++;
    }
}
