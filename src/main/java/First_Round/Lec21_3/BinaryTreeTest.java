package First_Round.Lec21_3;

import First_Round.Lec15_2.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    BinaryTree b = new BinaryTree();
    BinaryTree.Element<Object> o = new BinaryTree.Element<>("Object");
    BinaryTree.Element<Student> s = new BinaryTree.Element<>("Student");

    @Test
    public void testEmpty(){
        assertNull(b.root);
    }

    @Test
    public void testRoot(){
        b.insert(o);
        assertEquals(o, b.root);

    }

    @Test
    public void testMix(){
        b.insert(o);
        b.insert(s);
        assertEquals(b.root, o);
        assertEquals(b.root.right, s);
    }


}
