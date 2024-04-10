package Lec14;

public class A3Person {
    String vorname;
    String nachname;
    A3Adresse adresse;

    public A3Person(String vorname, String nachname, A3Adresse adresse){
        if(vorname.charAt(0) < 'A' || vorname.charAt(0) > 'Z') {
            throw new RuntimeException("Vorname muss mit Großbuchstaben beginnen");
        }else if(adresse.strasse.charAt(0) < 'A' || adresse.strasse.charAt(0) > 'Z'){
            throw new RuntimeException("Straße muss mit Großbuchstaben beginnen");
        }else if(adresse.ort.charAt(0) < 'A' || adresse.ort.charAt(0) > 'Z'){
            throw new RuntimeException("Ort muss mit Großbuchstaben beginnen");
        }else if(adresse.hausnummer.charAt(0) < '0' || adresse.hausnummer.charAt(0) > '9'){
            throw new RuntimeException("Hausnummer muss mit Ziffer beginnen");
        }else{
            this.vorname = vorname;
            this.nachname = nachname;
            this.adresse = adresse;
        }
    }

}
