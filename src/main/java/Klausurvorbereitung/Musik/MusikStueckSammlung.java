package Klausurvorbereitung.Musik;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Map.copyOf;

public class MusikStueckSammlung {
    Map<String, MusikStueck> sammlung = new HashMap<>();

    public void musikStueckEinfuegen(MusikStueck neu){
        if(sammlung.containsKey(neu.titel)){
            throw new IllegalArgumentException("Bereits vorhanden");
        }else{
            sammlung.put(neu.titel, neu);
        }
    }

    public MusikStueck[] getAllMusikStueckeNachTitel(){
        Map<String, MusikStueck> newM = new TreeMap<>(sammlung);
        MusikStueck[] out = new MusikStueck[sammlung.size()];
        return(newM.values().toArray(out));
    }
}
