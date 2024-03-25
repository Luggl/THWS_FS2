package Lec14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ueb1Test {
    @Test
    public void testDouble() {
        try {
            assertEquals(0, Ueb1.berechneKugelvolumen(0));
            assertEquals(4 / 3 * Math.PI * 1, Ueb1.berechneKugelvolumen(1));
            assertEquals(4 / 3 * Math.PI * 5 * 5 * 5, Ueb1.berechneKugelvolumen(5));
            assertEquals(4 / 3 * Math.PI * -1 * -1 * -1,Ueb1.berechneKugelvolumen(-1) );
            fail("Runtime exception erwartet");
        } catch (RuntimeException e){
            String errormessage = e.getMessage();
            assertEquals("Ungültiges Argument", errormessage);
        }

    }
}
