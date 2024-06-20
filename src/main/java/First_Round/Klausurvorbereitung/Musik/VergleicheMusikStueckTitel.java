package First_Round.Klausurvorbereitung.Musik;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {

    public int compare(MusikStueck a, MusikStueck b){
        return(a.titel.compareTo(b.titel));
    }
}
