package Second_Round.Lec23_1_2;

import static java.lang.Thread.sleep;

public class Yin {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                printloop("Yang");
            }
        };
        t.start();
        printloop("Yin");
    }

    public static void printloop(String s){
        while(true){
            System.out.println(s);
            try{
                sleep(50);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}