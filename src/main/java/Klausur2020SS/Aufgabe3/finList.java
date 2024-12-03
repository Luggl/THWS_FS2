package Klausur2020SS.Aufgabe3;

import java.io.Serializable;
import java.util.Collection;

public class finList<E extends Comparable<E> & Serializable> extends ArrayList<E> {
    public finList(Collection<? extends E> c){
        super(c);
    }

    @Override
    public void add(E element) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("Not going to happen du Schlingel");
    }
}
