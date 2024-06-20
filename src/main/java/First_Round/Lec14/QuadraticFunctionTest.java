package First_Round.Lec14;

import org.junit.jupiter.api.Test;

import static First_Round.Lec14.QuadraticFunction.roots;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticFunctionTest {
    @Test
    public void testCorrect(){
        QuadraticFunction test = new QuadraticFunction(4, -2, -28);
        assertEquals(2.91, roots(test)[0]);
        assertEquals(-2.41, roots(test)[1]);

    }
}
