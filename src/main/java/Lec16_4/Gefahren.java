package Lec16_4;

import static Lec16_4.Reaktion.*;

public enum Gefahren {
    GEFAHR_LINKS(RECHTS), GEFAHR_RECHTS(LINKS), GEFAHR_VORNE(BREMSEN);

    Reaktion r;

    Gefahren(Reaktion r){
        this.r= r;
    }
}
