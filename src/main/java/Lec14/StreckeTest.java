package Lec14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StreckeTest {

    @Test
    public void StreckeNegativ(){
        try{
            Strecke strecke = new Strecke(1, -4);
            fail("Exception expected!");
        }catch(RuntimeException e){
            assertEquals("negativ!",e.getMessage());
        }

    }
    @Test
    public void StreckeABTest(){
        Strecke strecke = new Strecke(4, 2);
        assertEquals(2, strecke.a);
        assertEquals(4, strecke.b);
    }

    @Test
    public void UeberschneidungTestFalse(){
        Strecke strecke1 = new Strecke(2, 4);
        Strecke strecke2 = new Strecke(4,7);
        assertFalse(Strecke.Ueberschneidung(strecke1, strecke2));
    }

    @Test
    public void UeberschneidungTestTrue(){
        Strecke strecke1 = new Strecke(2, 5);
        Strecke strecke2 = new Strecke(4,7);

        assertTrue(Strecke.Ueberschneidung(strecke1, strecke2));

        strecke1 = new Strecke(6, 12);
        assertTrue(Strecke.Ueberschneidung(strecke1, strecke2));

    }

    @Test
    public void toStringTest(){
        Strecke strecke = new Strecke(3, 5);
        assertEquals("3--5", strecke.toString());
    }


}
