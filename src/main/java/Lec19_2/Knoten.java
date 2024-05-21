package Lec19_2;

public class Knoten<E>{
    E element;
    Knoten<E> next;

    public Knoten(E element){
        this.element = element;
    }
    public E getElement(){
        return element;
    }
}
