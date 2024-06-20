package First_Round.Klausurvorbereitung.BaumVisitor;

public class Baum<E extends Comparable<E>> {

    public static class Knoten<E>{
        Knoten<E> left;
        Knoten<E> right;
        E content;

    }
    Knoten<E> root;

    public void einfuegen(E content){
        Knoten<E> c = new Knoten<E>();
        c.content = content;

        if(root==null){
            root = c;
        }else{
            einfuegen(root, c);
        }
    }

    private void einfuegen(Knoten<E> k, Knoten<E> c){
        if(k.content.compareTo(c.content) < 0){
            if(k.left != null){
                einfuegen(k.left, c);
            }else{
                k.left = c;
            }
        }else{
            if(k.right != null){
                einfuegen(k.right, c);
            }else{
                k.right = c;
            }
        }
    }

    protected void traversiere(Visitor<E> visitor){
        if(root == null) return;
        else traversiere(root, visitor);
    }
    protected void traversiere(Knoten<E> current, Visitor<E> visitor){
        if(current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if(current.right != null) traversiere(current.right, visitor);
    }

    public int size(){
        GrafZahl<E> count = new GrafZahl<>();
        traversiere(count);
        return(count.count);
    }
}
