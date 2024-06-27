package Second_Round.Lec22_1;

public class YangThread extends Thread{
    @Override
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
        YinThread yin = new YinThread();
        YangThread yang = new YangThread();

        yin.start();
        yang.start();
    }
}
