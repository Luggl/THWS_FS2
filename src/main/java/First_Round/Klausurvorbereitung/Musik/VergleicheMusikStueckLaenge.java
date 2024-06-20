package First_Round.Klausurvorbereitung.Musik;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge implements Comparator<MusikStueck> {

    public int compare(MusikStueck a, MusikStueck b){
        if(a.laenge<b.laenge){
            return -1;
        }else if(a.laenge > b.laenge){
            return 1;
        }else{
            return 0;
        }
    }
}
