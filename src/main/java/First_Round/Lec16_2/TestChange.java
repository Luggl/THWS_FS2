package First_Round.Lec16_2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestChange {

    static SimpleChangeCalculator s = new SimpleChangeCalculator();
    static ExpertChangeCalculator e = new ExpertChangeCalculator();
    static Coin[] c = Coin.values();

    public static int sumSimple(int euro, int cent){
        int[] simple = s.getChange(euro, cent);
        int out = 0;
        for(int i = 0; i<simple.length; i++){
            out += simple[i] * c[i].value;
        }

        return(out);
    }

    public static int sumExpert(int euro, int cent){
        int[] expert = e.getChange(euro,cent);
        int out = 0;
        for(int i = 0; i<expert.length; i++){
            out += expert[i] * c[i].value;
        }
        return(out);
    }

    @Test
    public void testRightAmount(){
        assertEquals(sumSimple(2,15), sumExpert(2,15));
        assertEquals(sumSimple(1,21), sumExpert(1,21));
        assertEquals(sumSimple(85, 42), sumExpert(85,42));
    }
    @Test
    public void testZero(){
        assertEquals(sumSimple(0, 0), sumExpert(0,0));
    }
}
