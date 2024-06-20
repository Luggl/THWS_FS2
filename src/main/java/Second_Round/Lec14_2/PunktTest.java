package Second_Round.Lec14_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PunktTest {
    Punkt p = new Punkt();

    public String getM(int x, int y) {
        String message = "";
        try {
            p.verschiebePunkt(x, y);
        }catch(Exception e) {
             message = e.getMessage();
        }
        return(message);
    }

    @Test
    public void testVerschiebenTrue(){
        p.verschiebePunkt(4, 5);
        assertEquals(4, p.x);
        assertEquals(5, p.y);
    }

    @Test
    public void testNegative(){

        assertEquals("Negative!",getM(1, -5));
    }

    @Test
    public void testXBiggest(){
        assertEquals("X Bigger than 1920", getM(1921, 15));
    }

    @Test
    public void testYBiggest(){
        assertEquals("Y Bigger than 1080", getM(5, 1081));
    }
}
