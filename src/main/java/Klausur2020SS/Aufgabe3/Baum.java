package Klausur2020SS.Aufgabe3;

public class Baum {
    Baumknoten root;

    public void insert(Baumknoten in){
        if(root == null){
            root = in;
        }else{
            if(in.name.compareTo(root.name) < 0){
                if(root.links == null){
                    root.links = in;
                }else{
                    insert(root.links, in);
                }
            }else{
                if(root.rechts == null){
                    root.rechts = in;
                }else{
                    insert(root.rechts, in);
                }
            }
        }
    }

    private void insert(Baumknoten temp, Baumknoten in){
        if(in.name.compareTo(temp.name) < 0){
            if(temp.links == null){
                temp.links = in;
            }else{
                insert(temp.links, in);
            }
        }else{
            if(temp.rechts == null){
                temp.rechts = in;
            }else{
                insert(temp.rechts, in);
            }
        }
    }
}
