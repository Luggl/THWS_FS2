package Lec14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void PersonFunc(){
        Adresse a = new Adresse("Musterstrasse", "12a", 97082, "Würzburg");
        Person b = new Person("Lukas", "Langpeter", a);

        assertEquals("Lukas", b.vorname);
        assertEquals("Musterstrasse", b.adresse.strasse);
        assertEquals("Würzburg", b.adresse.ort);
        assertEquals("12a", b.adresse.hausnummer);
    }

    @Test
    public void PersonVornameFalsch(){
        Adresse a = new Adresse("Musterstrasse", "12a", 97082, "Würzburg");
        try {
            Person b = new Person("lukas", "Langpeter", a);
            fail("Vorname Kleinbuchstabe - Expected Error");
        }catch(RuntimeException e){
            assertEquals("Vorname muss mit Großbuchstaben beginnen", e.getMessage());
        }
    }

    @Test
    public void PersonStrasseFalsch(){
        Adresse a = new Adresse("musterstrasse", "12a", 97082, "Würzburg");
        try {
            Person b = new Person("Lukas", "Langpeter", a);
            fail("Straße Kleinbuchstabe - Expected Error");
        }catch(RuntimeException e){
            assertEquals("Straße muss mit Großbuchstaben beginnen", e.getMessage());
        }

    }

    @Test
    public void PersonOrtFalsch(){
        Adresse a = new Adresse("Musterstrasse", "12a", 97082, "würzburg");
        try {
            Person b = new Person("Lukas", "Langpeter", a);
            fail("Ort Kleinbuchstabe - Expected Error");
        }catch(RuntimeException e){
            assertEquals("Ort muss mit Großbuchstaben beginnen", e.getMessage());
        }

    }

    @Test
    public void PersonHausnummerFalsch(){
        Adresse a = new Adresse("Musterstrasse", "A12", 97082, "Würzburg");
        try {
            Person b = new Person("Lukas", "Langpeter", a);
            fail("Hausnummer startet nicht mit Ziffer - Expected Error");
        }catch(RuntimeException e){
            assertEquals("Hausnummer muss mit Ziffer beginnen", e.getMessage());
        }

    }
}
