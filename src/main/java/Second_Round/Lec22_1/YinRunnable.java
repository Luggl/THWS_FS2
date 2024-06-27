package Second_Round.Lec22_1;

import static java.lang.Thread.sleep;

public class YinRunnable implements Runnable{
    public void run(){
        while(true){
            System.out.println("Yin");
            try{
                sleep(500);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
