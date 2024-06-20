package First_Round.Klausurvorbereitung.Fahrzeuge;

import java.util.ArrayList;

public abstract class Electric extends Fahrzeug{
    public static ArrayList<Fahrt> fahrtenbuch = new ArrayList<>();

    public abstract void kehreZurückZurLadestation();
}
