package First_Round.Lec14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class A2PunktTest {

    static A2Punkt punkt;

    public void create(){
        punkt = new A2Punkt();
        punkt.x = 1;
        punkt.y = 2;
    }

    public String tryVerschiebe(int x, int y){
        String errormessage ="";
        try{
            punkt.verschiebePunkt(x, y);
            fail("Fehler provozieren");
        }catch(RuntimeException e){
            errormessage = e.getMessage();
        }
        return(errormessage);
    }


    @Test
    public void testFunct(){
        create();
        punkt.verschiebePunkt(250, 385);
        assertEquals(250, punkt.x);
        assertEquals(385, punkt.y);
    }

    @Test
    public void testNegativeX(){
        create();
        assertEquals("Negativer Wert!", tryVerschiebe(-5, 4));

    }
    @Test
    public void testNegativeY() {
        create();
        assertEquals("Negativer Wert!", tryVerschiebe(8, -3));
    }
    @Test
    public void testOutofBoundX() {
        create();
        assertEquals("X greater than 1920!", tryVerschiebe(8000, 15));

    }
    @Test
    public void testOutofBoundY() {
        create();
        assertEquals("Y greater than 1080!", tryVerschiebe(25, 1081));
    }
}
