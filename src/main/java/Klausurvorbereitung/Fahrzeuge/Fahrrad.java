package Klausurvorbereitung.Fahrzeuge;

import java.util.ArrayList;

public class Fahrrad extends Fahrzeug{
    private double minVal = 12.5d;


    public void commitFahrt(Fahrt f){
        f.value = f.min * minVal;
        fahrtenbuch.add(f);
    }

}
