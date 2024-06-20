package First_Round.Lec22_1;

public class YinYang extends Thread{

    public void yin(){
        while(true) {
            System.out.println("Yin");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void run(){
        while(true) {
            try {

                sleep(500);
            } catch (
                    InterruptedException e
            ) {
                System.out.println(e.getMessage());
            }
            System.out.println("Yang");
        }
    }

    public static void main(String[] args) {
        YinYang y = new YinYang();
        y.start();
        y.yin();
    }
}
