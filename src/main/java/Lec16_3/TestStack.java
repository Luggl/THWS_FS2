package Lec16_3;

import Lec16_1.Dame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStack {
    StackVererbung s = new StackVererbung();
    int i = 1489;
    String st = "Der Papst trägt Overknees";
    Dame d = new Dame(4, 2);

    public Object pushVererbung(){
        s.push(st);
        s.push(d);
        return(s.getFirst());
    }

    public Object popVererbung(){
        s.push(st);
        s.push(d);
        return(s.pop());
    }
    @Test
    public void testPush(){
        assertEquals(d, pushVererbung());
    }
    @Test
    public void testPop(){
        assertEquals(d, popVererbung());
    }

}
