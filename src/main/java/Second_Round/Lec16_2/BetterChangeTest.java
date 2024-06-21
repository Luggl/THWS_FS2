package Second_Round.Lec16_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BetterChangeTest {
    BetterChangeCalculator bcc = new BetterChangeCalculator();

    @Test
    public void testOneEuro(){
        int[] expected = new int[]{0, 0, 0, 0, 0, 0, 1, 0};
        assertArrayEquals(expected, bcc.getChange(1, 0));
    }

    @Test
    public void test67Cents(){
        int[] expected = new int[]{0, 1, 1, 1, 0, 1, 0, 0};
        assertArrayEquals(expected, bcc.getChange(0, 67));
    }
}
