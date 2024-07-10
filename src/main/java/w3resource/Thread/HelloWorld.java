package w3resource.Thread;

public class HelloWorld extends Thread{

    public void run(){
        System.out.println("Hello,World!!");
    }

    public static class HelloWorldInterface implements Runnable{
        public void run(){
            System.out.println("Hello, World!");
        }
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new HelloWorld(){
            @Override
            public void run(){
                System.out.println("Hello, World");
            }
        });
       // t1.start();
        Thread t2 = new Thread(new HelloWorldInterface());
       // t2.start();
        HelloWorld hw = new HelloWorld();
        hw.start();
    }

}
