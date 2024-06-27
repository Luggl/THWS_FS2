package Second_Round.Lec22_1;

import static java.lang.Thread.sleep;

public class YangRunnable implements Runnable{
    public void run(){
        while(true){
            System.out.println("Yang");
            try{
                sleep(500);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        YinRunnable yin = new YinRunnable();
        YangRunnable yang = new YangRunnable();

        Thread t1 = new Thread(yin);
        Thread t2 = new Thread(yang);

        t1.start();
        t2.start();
    }
}
