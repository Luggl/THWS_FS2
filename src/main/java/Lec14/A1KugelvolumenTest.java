package Lec14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class A1KugelvolumenTest {
    @Test
    public void testDouble0() {
            assertEquals(0, A1Kugelvolumen.berechneKugelvolumen(0));

    }

    @Test
    public void testDouble1(){
        assertEquals(4 / 3 * Math.PI * 1, A1Kugelvolumen.berechneKugelvolumen(1));
    }
    @Test
    public void testDouble5(){
        assertEquals(4 / 3 * Math.PI * 5 * 5 * 5, A1Kugelvolumen.berechneKugelvolumen(5));
    }
    @Test
    public void testDoubleFailure(){
        try{
            assertEquals(4 / 3 * Math.PI * -1 * -1 * -1, A1Kugelvolumen.berechneKugelvolumen(-1));
            fail("Negative Radius not allowed! Test failed");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
