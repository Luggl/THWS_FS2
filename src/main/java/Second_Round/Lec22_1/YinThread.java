package Second_Round.Lec22_1;

public class YinThread extends Thread{
    @Override
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
