package First_Round.Lec21_3;

public class BinaryTree <E>{

    Element<E> root;

    public void insert(Element<E> e){
        if(root == null){
            root = e;
        }else{
            insert(root, e);
        }
    }

    private void insert(Element<E> temp, Element<E> e) {
        if (e.name.compareTo(temp.name) < 0) {
            if(temp.left == null){
                temp.left = e;
            }else{
                insert(temp.left, e);
            }
        }else{
            if(temp.right == null){
                temp.right = e;
            }else{
                insert(temp.right, e);
            }
        }
    }

    public void print() {
        print(root);

    }
    private void print(Element<E> temp){
        if(temp.left != null){
            print(temp.left);
        }
        System.out.println(temp.name);
        if(temp.right != null){
            print(temp.right);
        }
    }


    public static class Element<E>{
        private String name;
        Element<E> left;
        Element<E> right;

        public Element(String name){
            this.name = name;
        }
        public String getName(){
            return(this.name);
        }
    }

    public static void main(String[] args) {
        BinaryTree<String> b = new BinaryTree<>();
        Element<String> a = new Element<>("Lukas");
        Element<String> d = new Element<>("Denis");
        Element<String> c = new Element<>("Tobias");

        b.insert(a);
        b.insert(d);
        b.insert(c);

        b.print();
    }

}
