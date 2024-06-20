package First_Round.Lec15_1;

public class Abteilungsleiter extends Angestellter {

    public Abteilungsleiter(String vorname, String nachname, int identifikator, int grundgehalt, String geburtsdatum){
        super(vorname, nachname, identifikator, grundgehalt, geburtsdatum);
        this.gehaltsfaktor = 2.0;
        this.gehalt = grundgehalt * gehaltsfaktor;
    }

    public void befoerdern(Angestellter a){
        a.gehaltsfaktor += a.gehaltsfaktor * 0.1;
        a.gehalt = a.grundgehalt * a.gehaltsfaktor;
    }

}
