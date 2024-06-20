package Second_Round.Lec14_3;

public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse){
        if(Character.isUpperCase(vorname.charAt(0)) && Character.isUpperCase(nachname.charAt(0)) && Character.isUpperCase(adresse.ort.charAt(0)) && adresse.hausnummer.charAt(0) >= '0' && adresse.hausnummer.charAt(0) <= '9'){
            this.vorname = vorname;
            this.nachname = nachname;
            this.adresse = adresse;
        }else{
            throw new RuntimeException("Failed");
        }
    }
}
