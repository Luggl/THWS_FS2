package First_Round.Lec15_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainPersonTest {

    static Professor p;
    static Student s;

    public void initS(){
        s = new Student("Programmieren S");
    }
    public void initP(){
        p = new Professor("Programmieren P");
    }
    public String konstruktorS(){
        initS();
        return(s.taetigkeit);
    }
    public String konstruktorP(){
        initP();
        return(p.taetigkeit);
    }

    public String taetigkeitS(){
        initS();
        return(s.gibTaetigkeitAus());
    }

    public String taetigkeitP(){
        initP();
        return(p.gibTaetigkeitAus());
    }

    @Test
    public void testKonstruktS(){
        assertEquals("Programmieren S", konstruktorS());
    }
    @Test
    public void testKonstruktP(){
        assertEquals("Programmieren P", konstruktorP());
    }
    @Test
    public void testTaetigkeitS(){
        assertEquals("Der Student besucht das Fach Programmieren S.", taetigkeitS());
    }
    @Test
    public void testTaetigkeitP(){
        assertEquals("Der Professor unterrichtet Programmieren P.", taetigkeitP());
    }
}
