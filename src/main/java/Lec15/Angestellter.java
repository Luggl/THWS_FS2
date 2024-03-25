package Lec15;

public class Angestellter {
    String vorname;
    String nachname;
    int identifikator;
    int grundgehalt;
    double gehaltsfaktor;
    String geburtsdatum;
    double gehalt;

    public Angestellter(String vorname, String nachname, int identifikator, int grundgehalt, String geburtsdatum){
        this. vorname = vorname;
        this. nachname = nachname;
        this.identifikator = identifikator;
        this.grundgehalt = grundgehalt;
        this.geburtsdatum = geburtsdatum;
        this.gehaltsfaktor = 1.0;
        this.gehalt = grundgehalt * gehaltsfaktor;
    }
}
