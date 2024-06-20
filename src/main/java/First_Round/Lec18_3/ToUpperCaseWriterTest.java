package First_Round.Lec18_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.Test;

public class ToUpperCaseWriterTest
{
//  ToUpperCaseWriter writer;
//  ByteArrayOutputStream baos;

//  @BeforeEach
//  public void prepareTest()
//  {
//    baos = new ByteArrayOutputStream();
//    OutputStreamWriter osw = new OutputStreamWriter(baos);
//    writer = new ToUpperCaseWriter(osw);
//  }

  public String getAscii(){
    String out = "";
    for(int i = 0; i < 128; i++){
      out = out + (char)(i);
    }
    return(out);
  }

  public void testProcess(String s){
    try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);)
    {
      writer.write(s);
      writer.flush();
      String uppercase = baos.toString();
      String check = "";
      for(int i = 0; i<s.length(); i++){
        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
          check = check + (char)(s.charAt(i) - 32);
        }else{
          check = check + s.charAt(i);
        }
      }
      System.out.println(check);
      assertEquals(uppercase, check);
    }catch (IOException e){
      fail("IOException" + e.getMessage());
    }

  }

  @Test
  public void writeCharTest()
  {
    testProcess("a");
  }

  @Test
  public void writeCharTestWithNonChar()
  {
    testProcess("1");
  }

  @Test
  public void writeAsciiCharTest(){
    testProcess(getAscii());
  }
  
//  @AfterEach
//  public void cleanUp()
//  {
//    try
//    {
//      writer.close();
//    }
//    catch (IOException e)
//    {
//      fail("IOException" + e.getMessage());
//    }
//  }
}
