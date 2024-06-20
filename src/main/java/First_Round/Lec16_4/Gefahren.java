package First_Round.Lec16_4;

public enum Gefahren {
    GEFAHR_LINKS(Reaktion.RECHTS), GEFAHR_RECHTS(Reaktion.LINKS), GEFAHR_VORNE(Reaktion.BREMSEN);

    Reaktion r;

    Gefahren(Reaktion r){
        this.r= r;
    }
}
