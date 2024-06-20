package First_Round.Lec22_5;

import First_Round.Lec22_5.Baum.Knoten;

public interface Visitor<T> {
    public void visit(Knoten<T> current);
}
