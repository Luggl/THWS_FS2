package Klausur2020SS_2.Aufgabe3;

public class GenericKnoten<E>{
    GenericKnoten<E> next;
    E element;
    public GenericKnoten(E element){
        this.element = element;
    }
}
