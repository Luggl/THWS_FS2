package Lec14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ueb2Test {
    @Test
    public void testFunct(){
        Ueb2 punkt = new Ueb2();
        punkt.x = 1;
        punkt.y = 2;
        punkt.verschiebePunkt(250, 385);
        assertEquals(250, punkt.x);
        assertEquals(385, punkt.y);
    }

    @Test
    public void testNegativeX(){
        Ueb2 punkt = new Ueb2();
        punkt.x = 1;
        punkt.y = 2;
        try{
            punkt.verschiebePunkt(1, -3);
            fail("Negative Y - expected Error!");
        }catch (RuntimeException e){
            assertEquals("Negativer Wert!", e.getMessage());
        }

    }
    @Test
    public void testNegativeY() {
        Ueb2 punkt = new Ueb2();
        punkt.x = 1;
        punkt.y = 2;
        try {
            punkt.verschiebePunkt(-4, 3);
            fail("Negative X - expected Error!");
        } catch (RuntimeException e) {
            assertEquals("Negativer Wert!", e.getMessage());
        }
    }
    @Test
    public void testOutofBoundX() {
        Ueb2 punkt = new Ueb2();
        punkt.x = 1;
        punkt.y = 2;
        try {
            punkt.verschiebePunkt(1921, 3);
            fail("Out of Bound X - expected Error!");
        } catch (RuntimeException e) {
            assertEquals("X greater than 1920!", e.getMessage());
        }
    }
    @Test
    public void testOutofBoundY() {
        Ueb2 punkt = new Ueb2();
        punkt.x = 1;
        punkt.y = 2;
        try {
            punkt.verschiebePunkt(3, 1081);
            fail("Out of Bound Y - expected Error!");
        } catch (RuntimeException e) {
            assertEquals("Y greater than 1080!", e.getMessage());
        }
    }
}
