package Klausur2020SS_2.Aufgabe1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class KonfiguratorTest {
    static Map<String, String> ergebnis = new HashMap<>();
    static String[] testStrings = new String[]{"mail.transport.protocol=smtp", "password=K[O8a}5#"};
    public static void init(){
        try {
            ergebnis = Konfigurator.getMap(Konfigurator.liesKongurationsdatei());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static boolean testEntries(){
        init();
        boolean first = false;
        boolean second = false;
        for(String s : ergebnis.keySet()) {
            if (testStrings[0].equals((s +'='+ ergebnis.get(s)))) {
                first = true;
            }
            if (testStrings[1].equals((s + '='+ ergebnis.get(s)))) {
                second = true;
            }
        }
        if(first && second){
            return(true);
        }else{
            return(false);
        }

    }
    @Test
    public void test(){
        assertTrue(testEntries());
    }
}
