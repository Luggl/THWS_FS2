package Lec16_4;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static Lec16_4.Reaktion.*;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    Robot r = new Robot();
    Mensch m = new Mensch();
    Cyborg c = new Cyborg();

    public int getUnentschiedenCount(Object o){
        int out = 0;
        if(o.getClass() == m.getClass()) {
            for (int i = 0; i < 1000; i++) {
                if(Objects.equals(UNENTSCHIEDEN, m.entscheide(Gefahren.GEFAHR_RECHTS))){
                    out++;
                }
            }
        }else if(o.getClass() == c.getClass()) {
            for (int i = 0; i < 1000; i++) {
                if (Objects.equals(UNENTSCHIEDEN, c.entscheide(Gefahren.GEFAHR_RECHTS))) {
                    out++;
                }
            }
        }else{
            return(0);
        }
        return(out);
    }


    @Test
    public void testRobot(){
        assertEquals(RECHTS, r.entscheide(Gefahren.GEFAHR_LINKS));
        assertEquals(LINKS, r.entscheide(Gefahren.GEFAHR_RECHTS));
        assertEquals(BREMSEN, r.entscheide(Gefahren.GEFAHR_VORNE));
    }

    @Test
    public void testHumanAccuracy(){
        boolean x = getUnentschiedenCount(m) > 230 && getUnentschiedenCount(m) < 270;
        assertTrue(x);
    }
    @Test
    public void testCyborgaccuracy(){
        boolean x = getUnentschiedenCount(c) > 100 && getUnentschiedenCount(c) < 175;
        assertTrue(x);
    }

}
