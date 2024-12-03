package First_Round.Klausurvorbereitung.Fahrzeuge;

public enum Farben implements Comparable<Farben> {
    Rot(12), Blau(23), Gruen(1), Gelb(4), Schwarz(56), Weis(42);

    public int value;

    public int getValue(){
        return(this.value);
    }
    public void setValue(int value){
        this.value = value;
    }
    Farben(int value){
        this.value = value;
    }
}
