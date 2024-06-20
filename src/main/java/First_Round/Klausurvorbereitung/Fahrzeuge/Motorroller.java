package First_Round.Klausurvorbereitung.Fahrzeuge;

public class Motorroller extends Fahrzeug{

    private double kmVal = 15d;


    public void commitFahrt(Fahrt f){
        f.value = (300 + (kmVal * f.km));
        fahrtenbuch.add(f);
    }

}
