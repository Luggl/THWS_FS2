package Lec14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class A4StreckeTest {

    @Test
    public void StreckeNegativ(){
        try{
            A4Strecke strecke = new A4Strecke(1, -4);
            fail("Exception expected!");
        }catch(RuntimeException e){
            assertEquals("negativ!",e.getMessage());
        }

    }
    @Test
    public void StreckeABTest(){
        A4Strecke strecke = new A4Strecke(4, 2);
        assertEquals(2, strecke.a);
        assertEquals(4, strecke.b);
    }

    @Test
    public void UeberschneidungTestFalse(){
        A4Strecke strecke1 = new A4Strecke(2, 4);
        A4Strecke strecke2 = new A4Strecke(4,7);
        assertFalse(A4Strecke.Ueberschneidung(strecke1, strecke2));
    }

    @Test
    public void UeberschneidungTestTrue(){
        A4Strecke strecke1 = new A4Strecke(2, 5);
        A4Strecke strecke2 = new A4Strecke(4,7);

        assertTrue(A4Strecke.Ueberschneidung(strecke1, strecke2));

        strecke1 = new A4Strecke(6, 12);
        assertTrue(A4Strecke.Ueberschneidung(strecke1, strecke2));

    }

    @Test
    public void toStringTest(){
        A4Strecke strecke = new A4Strecke(3, 5);
        assertEquals("3--5", strecke.toString());
    }


}
