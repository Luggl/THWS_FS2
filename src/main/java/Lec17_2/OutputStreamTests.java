package Lec17_2;

import Lec17_1.ArrayIndex;
import Lec17_1.FileNotFound;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.jupiter.api.Assertions.*;

public class OutputStreamTests {

    byte[] b = {10, 12, 'f', 25, 31, 46};
    OutputStream o;

    public void init() {
        try {
            o = new FileOutputStream("test.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


//    public void write(byte[] b, int off, int len)throws IOException{
//
//    }

    @Test
    public void TestNegativeOff(){
        init();
        try{
            o.write(b, -1, 2);
            fail("Negative off!");
        }catch(IOException f){
            fail("IOException not expected");
        }catch(IndexOutOfBoundsException e){
            assertEquals(e.getClass(), IndexOutOfBoundsException.class);
        }

    }

    @Test
    public void TestNegativeLen(){
        init();
        try{
            o.write(b, 2, -5);
            fail("Negative len!");
        }catch(IOException e){
            fail("IOException not expected");
        }catch(IndexOutOfBoundsException e){
            assertEquals(e.getClass(), IndexOutOfBoundsException.class);
        }
    }

    @Test
    public void TestOffOver(){
        init();
        try{
            o.write(b, 25, 2);
            fail("Off too big");
        }catch(IOException e){
            fail("IOException not expected");
        }catch(IndexOutOfBoundsException e){
            assertEquals(e.getClass(), IndexOutOfBoundsException.class);
        }
    }

    @Test
    public void TestLenOver(){
        init();
        try{
            o.write(b, 1, 25);
            fail("Len too big");
        }catch(IOException e){
            fail("IOException not expected");
        }catch(IndexOutOfBoundsException e){
            assertEquals(e.getClass(), IndexOutOfBoundsException.class);
        }
    }
    
}
