package Second_Round.Lec16_4;

import static Second_Round.Lec16_4.Reaktion.*;

public enum Gefahren {
    GEFAHR_LINKS(RECHTS), GEFAHR_RECHTS(LINKS), GEFAHR_VORNE(BREMSEN);

    private final Reaktion r;

    Gefahren(Reaktion r){
        this.r = r;
    }

    public Reaktion getreaction(){
        return(this.r);
    }


}
