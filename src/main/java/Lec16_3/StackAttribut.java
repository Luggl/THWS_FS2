package Lec16_3;

import java.util.ArrayList;

public class StackAttribut {
    ArrayList a = new ArrayList();

    public void push(Object in){
        a.add(in);
    }

    public Object pop(){
        Object out = a.removeFirst();
        return(out);
    }

    public int getSize(){
        return(a.size());
    }

    public static void main(String[] args){
        StackAttribut s = new StackAttribut();
        String st = "Ich bin ein String";
        int i = 1356;
        s.push(st);
        s.push(i);
        System.out.println(s.getSize());
        System.out.println(s.pop());
        System.out.println(s.getSize());
        System.out.println(s.pop());
    }

}
