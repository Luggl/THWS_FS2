package Second_Round.Lec15_1;

public class Abteilungsleiter extends Angestellte{
    double gehaltsfaktor = 2d;

    public void befoerdern(Angestellte a){
        a.gehaltsfaktor = a.gehaltsfaktor * 1.1;
    }

}
