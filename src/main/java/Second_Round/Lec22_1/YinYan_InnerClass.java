package Second_Round.Lec22_1;

public class YinYan_InnerClass extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Yin");
            try {
                sleep(50);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
                e.printStackTrace();
            }
        }
    }

    private static class Yang extends Thread {

        @Override
        public void run() {
            while (true) {
                System.out.println("Yang");
                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            YinYan_InnerClass y = new YinYan_InnerClass();
            Yang yang = new Yang();
            y.start();
            yang.start();
        }
    }
}
