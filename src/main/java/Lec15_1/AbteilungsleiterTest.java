package Lec15_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbteilungsleiterTest {

    @Test
    public void constructTest(){
        Abteilungsleiter a = new Abteilungsleiter("Denis", "Goshi", 0, 2500, "10.01.2004");
        assertEquals("Denis", a.vorname);
        assertEquals("Goshi", a.nachname);
        assertEquals(0, a.identifikator);
        assertEquals(2500, a.grundgehalt);
        assertEquals("10.01.2004", a.geburtsdatum);
        assertEquals(2, a.gehaltsfaktor);
        assertEquals(2500 * 2, a.gehalt);

    }
    @Test
    public void befoerdernTest(){
        Abteilungsleiter a = new Abteilungsleiter("Denis", "Goshi", 0, 2500, "10.01.2004");
        Angestellter b = new Angestellter("Lukas", "Langpeter", 1, 120, "06.01.1997");
        assertEquals(120, b.gehalt);
        a.befoerdern(b);
        assertEquals(120 * 1.1, b.gehalt);
    }
}
