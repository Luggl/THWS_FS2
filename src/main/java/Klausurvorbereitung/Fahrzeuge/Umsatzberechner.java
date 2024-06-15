package Klausurvorbereitung.Fahrzeuge;

public class Umsatzberechner {

    public double gesamtUmsatz(){
        double out = 0;
        for(Fahrt f : Fahrzeug.fahrtenbuch){
            out += f.value;
        }
        return(out);
    }

    public double berechneElektroumsatz(){
        double out = 0;
        for(Fahrt f : Electric.fahrtenbuch){
            out += f.value;
        }
        return(out);
    }


}
