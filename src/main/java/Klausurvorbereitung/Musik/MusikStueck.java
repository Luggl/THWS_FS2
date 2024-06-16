package Klausurvorbereitung.Musik;

public class MusikStueck {
    String titel;
    String interpret;
    int laenge;


    public MusikStueck(String titel, String interpret, int laenge){
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }
    @Override
    public String toString(){
        return("Musikstück:\nTitel:\t\t" + titel + "\nInterpret:\t" + interpret + "\nLänge:\t\t" + laenge);

    }
}
