package Second_Round.Lec19_2;

public class GenericStack<E> {
    GenericNode<E> start;

    public void push(E element){
        GenericNode<E> g = new GenericNode<>(element);
        if(start != null){
            g.next = start;
            start = g;
        }else{
            start = g;
        }
    }

    public E pop(){
        if(start != null){
            E out = start.element;
            if(start.next != null){
                start = start.next;
            }else{
                start = null;
            }
            return(out);
        }else{
            throw new RuntimeException("Nothing here");
        }
    }

    public static void main(String[] args) {
        GenericStack<String> s = new GenericStack<>();
        s.push("hallo");
        s.push("welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}
