package Klausurvorbereitung.Fahrzeuge;

import java.util.ArrayList;

public class Kleintransporter extends Fahrzeug {

    double kmVal = 30d;

    public void commitFahrt(Fahrt f){
        double out = kmVal * f.km;
        if(f.min > 60){
            out += 25*(f.min - 60);
        }
        f.value = out;
        fahrtenbuch.add(f);
    }

}
