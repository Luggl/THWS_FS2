package Second_Round.Lec22_5;

public class Baum<E extends Comparable<E>>{

    public static class Knoten<E>
    {
        Knoten<E> left;
        Knoten<E> right;
        E content;

        public Knoten(E content){
            this.content = content;
    }

    }

    Knoten<E> root;
    public void einfuegen(E content) {
        if(root == null){
            root = new Knoten<>(content);
        }else{

        }
    }

    protected void traversiere(Visitor<E> visitor) {
        if (root == null) return;
        else traversiere(root, visitor);
    }
    protected void traversiere(Knoten<E> current, Visitor<E> visitor)
    {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }

    public int size(){
        Visitor<E> v = new Visitor<>();
        traversiere(v);
        return(v.count);
    }
}
