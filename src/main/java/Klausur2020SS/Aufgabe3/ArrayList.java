package Klausur2020SS.Aufgabe3;

import java.util.Collection;

public class ArrayList<E>{
    Knoten<E> root;
    Knoten<E> temp;

    private void init(E element){
        if(root == null){
            root = new Knoten<>(element);
        }else{
            root.next = new Knoten<>(element);
        }
    }


    public ArrayList(Collection<? extends E> c){
        for(E element : c){
            init(element);
        }
    }

    public void add(E element){
        throw new UnsupportedOperationException("Not allowed!");
    }
}
