package w3resource.Thread;

public class EvenOdd extends Thread{
    public void run(){
        while(true){
            int n = (int)(Math.random() * 20);
            boolean even = (n%2==0);

            System.out.println(n + "\t-->\t" + ((even) ? ("even"):("odd")));

            try {
                sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        EvenOdd e1 = new EvenOdd();
        EvenOdd e2 = new EvenOdd();

        e1.start();
        e2.start();

    }

}
