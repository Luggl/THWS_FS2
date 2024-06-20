package First_Round.Lec16_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueenTest {
    static Dame d = new Dame(6, 6);

    public static Brett QueenSim(){            //Queen - 6, 6
        Brett b = new Brett();
        b.brett = new boolean[][]{
                {true,  false,  false,  false,  false,  true,   false,  false},
                {false, true,   false,  false,  false,  true,   false,  false},
                {false, false,  true,   false,  false,  true,   false,  false},
                {false, false,  false,  true,   false,  true,   false,  true},
                {false, false,  false,  false,  true,   true,   true,   false},
                {true,  true,   true,   true,   true,   true,   true,   true},
                {false, false,  false,  false,  true,   true,   true,   false},
                {false, false,  false,  true,   false,  true,   false,  true}
        };
        return(b);
    }

    public static boolean ValTest(){
        for(int i = 1; i<=8; i++){
            for(int j = 1; j<=8; j++){
                if (!(QueenSim().gibFeld(i, j) == d.gibErlaubteFelder().gibFeld(i, j))){
                    return(false);
                }
            }
        }
        return(true);
    }

    @Test
    public void QueenTest(){
        assertTrue(ValTest());

    }
}
