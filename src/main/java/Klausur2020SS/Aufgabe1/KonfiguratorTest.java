package Klausur2020SS.Aufgabe1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class KonfiguratorTest {
    static Map<String, String> map = new HashMap<>();
    boolean out = false;

    @BeforeAll
    public static void mapInit(){
        try {
            map = Konfigurator.getMap(Konfigurator.liesKongurationsdatei());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void testLines(String key, String value) {
        if (map.containsKey(key) && map.containsValue(value)) {
            out = true;
        }
    }

    public boolean firstLine(){
        String firstLineKey = "mail.transport.protocol";
        String firstLineValue = "smtp";
        testLines(firstLineKey, firstLineValue);
        return(out);

    }
    public boolean lastLine(){
        String lastLineKey = "password";
        String lastLineValue = "K[O8a}5#";
        testLines(lastLineKey, lastLineValue);
        return(out);

    }

    @Test
    public void testKonfigfirst(){
        assertTrue(firstLine());
    }
    @Test
    public void testKonfiglast(){
        assertTrue(lastLine());
    }
}
