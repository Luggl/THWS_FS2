package Lec21_3;

import static Lec21_3.BinaryTree.*;

import Lec15_2.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    BinaryTree b = new BinaryTree();
    Element<Object> o = new Element<>("Object");
    Element<Student> s = new Element<>("Student");

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
