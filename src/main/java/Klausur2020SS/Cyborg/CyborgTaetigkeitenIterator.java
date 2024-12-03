package Klausur2020SS.Cyborg;

import java.util.Iterator;

public class CyborgTaetigkeitenIterator implements Iterator<Taetigkeit> {

    public int count = 0;
    private Taetigkeit last;

    public boolean hasNext(){
        if(count<3){
            return(true);
        }else{
            return(false);
        }
    }

    public Taetigkeit next(){
        Taetigkeit out = Taetigkeit.values()[(int)(Math.random()*Taetigkeit.values().length)];
        if(last != null && last.name().equals(out.name())){
            count ++;
        }else{
            count = 0;
        }
        last = out;
        return(out);
    }
}
