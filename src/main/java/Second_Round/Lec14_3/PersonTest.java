package Second_Round.Lec14_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    public Person testTrue(){
        return(new Person("Lukas", "Langpeter", new Adresse("Hartmannstraße", "7b", 97082, "Würzburg")));
    }

    public String getFailmsg(){
        String out ="";
        try{
            Person fail = new Person("Denis", "goshi", new Adresse("Italostraße", "13", 97082, "Würzburg"));
        }catch(Exception e){
            out = e.getMessage();
        }
        return(out);
    }

    @Test
    public void testPersonTrue(){
        assertSame(testTrue().getClass(), Person.class);
    }

    @Test
    public void testPersonFail(){
        assertEquals("Failed", getFailmsg());
    }

}
