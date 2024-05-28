package Lec19_2;

public class GenericStack <E>{
    Knoten<E> start;

    public GenericStack(){

    }

    public GenericStack(E element){
        start = new Knoten<>(element);
    }

    public void push(E element){
        Knoten<E> k = new Knoten<>(element);
        if(start!=null) {
            k.next = start;
        }
        start = k;
    }

    public E pop() {
        if (start != null) {
            Knoten<E> out = start;
            if (start.next != null) {
                start = start.next;
            }else{
                start = null;
            }
            return(out.getElement());
        }else{
            throw new RuntimeException("No Object in Stack!");
        }
    }

    public static void main(String[] args) {
        GenericStack<String> s = new GenericStack<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
