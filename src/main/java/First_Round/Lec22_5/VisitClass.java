package First_Round.Lec22_5;

import First_Round.Lec22_5.Baum.Knoten;

public class VisitClass implements Visitor{

    public int count;

    @Override
    public void visit(Knoten current){
        this.count++;
    }

}
