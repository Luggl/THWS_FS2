package First_Round.Lec14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class A3PersonTest {

    @Test
    public void PersonFunc(){
        A3Adresse a = new A3Adresse("Musterstrasse", "12a", 97082, "Würzburg");
        A3Person b = new A3Person("Lukas", "Langpeter", a);

        assertEquals("Lukas", b.vorname);
        assertEquals("Musterstrasse", b.adresse.strasse);
        assertEquals("Würzburg", b.adresse.ort);
        assertEquals("12a", b.adresse.hausnummer);
    }

    @Test
    public void PersonVornameFalsch(){
        A3Adresse a = new A3Adresse("Musterstrasse", "12a", 97082, "Würzburg");
        try {
            A3Person b = new A3Person("lukas", "Langpeter", a);
            fail("Vorname Kleinbuchstabe - Expected Error");
        }catch(RuntimeException e){
            assertEquals("Vorname muss mit Großbuchstaben beginnen", e.getMessage());
        }
    }

    @Test
    public void PersonStrasseFalsch(){
        A3Adresse a = new A3Adresse("musterstrasse", "12a", 97082, "Würzburg");
        try {
            A3Person b = new A3Person("Lukas", "Langpeter", a);
            fail("Straße Kleinbuchstabe - Expected Error");
        }catch(RuntimeException e){
            assertEquals("Straße muss mit Großbuchstaben beginnen", e.getMessage());
        }

    }

    @Test
    public void PersonOrtFalsch(){
        A3Adresse a = new A3Adresse("Musterstrasse", "12a", 97082, "würzburg");
        try {
            A3Person b = new A3Person("Lukas", "Langpeter", a);
            fail("Ort Kleinbuchstabe - Expected Error");
        }catch(RuntimeException e){
            assertEquals("Ort muss mit Großbuchstaben beginnen", e.getMessage());
        }

    }

    @Test
    public void PersonHausnummerFalsch(){
        A3Adresse a = new A3Adresse("Musterstrasse", "A12", 97082, "Würzburg");
        try {
            A3Person b = new A3Person("Lukas", "Langpeter", a);
            fail("Hausnummer startet nicht mit Ziffer - Expected Error");
        }catch(RuntimeException e){
            assertEquals("Hausnummer muss mit Ziffer beginnen", e.getMessage());
        }

    }
}
