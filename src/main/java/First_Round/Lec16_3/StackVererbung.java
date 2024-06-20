package First_Round.Lec16_3;


import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList implements IStack
{

    public void push(Object o) {
        add(0, o);
    }
    public Object pop(){
        Object out = removeFirst();
        return(out);
    }
    public int getSize(){
        return(size());
    }

    public static void main(String[] args){
        String s = "Ich bin ein String";
        int i = 12;

        StackVererbung stack = new StackVererbung();
        stack.push(s);
        stack.push(i);

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        boolean[] b = new boolean[]{true, false, false, true};
        stack.push(b);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}

