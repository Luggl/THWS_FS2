package Second_Round.Lec14_1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KugelvolumenTest {

    private double testKugelvolumen(double d){
        return(Kugelvolumen.berechneKugelvolumen(d));
    }


    @Test
    public void testKugelvolumenZero(){
        assertEquals(0, testKugelvolumen(0));
    }

    @Test
    public void testKugelvolumenOne(){
        assertEquals((4/3d) * Math.PI, testKugelvolumen(1));
    }

    @Test
    public void testKugelvolumenFive(){
        assertEquals((4/3d) * Math.PI * 5 * 5 * 5, testKugelvolumen(5));
    }

    @Test
    public void testKugelvolumenMinus(){
        assertEquals(0, testKugelvolumen(-1));
    }

}
