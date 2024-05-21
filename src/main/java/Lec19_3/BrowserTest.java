package Lec19_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.Optional;



public class BrowserTest {
    Browser b = new Browser();
    @Test
    public void backTest(){
        Optional<URL> u = b.back();
        if (u.isPresent()){
            System.out.println("present");
            assertEquals(b.retrieveSite(u.get()), u.get().toString());
        }else{
            System.out.println("null");
            assertEquals(true, u.isEmpty());
        }

    }
}
