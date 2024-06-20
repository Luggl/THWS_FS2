package First_Round.Klausurvorbereitung.Generics;

import java.util.ArrayList;
import java.util.List;

public class Flatten<E> {

    public List<E> flatten(List<List<E>> in){
        List<E> out = new ArrayList<>();
        for(List<E> list : in){
            for(E e : list){
                out.add(e);
            }
        }

        return(out);
    }
}
