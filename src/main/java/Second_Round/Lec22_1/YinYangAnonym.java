package Second_Round.Lec22_1;

import static java.lang.Thread.sleep;

public class YinYangAnonym {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    System.out.println("Yang");
                    try{
                        sleep(500);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        while(true){
            System.out.println("Yin");
            try{
                sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
