package Klausur2020SS.Cyborg;

import java.util.Iterator;

public class CyborgTaetigkeiten implements Iterable<Taetigkeit>{

    @Override
    public CyborgTaetigkeitenIterator iterator(){
        return(new CyborgTaetigkeitenIterator());
    }

    public static void main(String[] args) {
        CyborgTaetigkeiten ct = new CyborgTaetigkeiten();
        CyborgTaetigkeitenIterator iterator = ct.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
