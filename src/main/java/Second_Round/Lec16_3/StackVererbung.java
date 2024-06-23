package Second_Round.Lec16_3;


import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung<E> extends ArrayList<E>
{
    public void push(E element){
        StackVererbung.super.addFirst(element);
    }
    public E pop(){
        return(StackVererbung.super.removeFirst());
    }
  
}
