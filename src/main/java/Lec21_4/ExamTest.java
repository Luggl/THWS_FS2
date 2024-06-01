package Lec21_4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExamTest {
    Exam e = new Exam();

    @Test
    public void testFile(){
        try {
            e.readQuestions();
            e.toTest();
            assertTrue(true);
        }catch(Exception e){
            fail();
        }
    }
}
