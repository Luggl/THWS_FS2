package First_Round.Klausurvorbereitung.Musik;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
