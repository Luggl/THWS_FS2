package Second_Round.Lec72_2;

import java.io.*;

public class StreamComparison {
    public static long Copyunbuffered(String path){
        long start = System.nanoTime();

        try(FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream("copyUnbuffered.mp3");
            ) {
            int b;

            do {
                b = fis.read();
                if (b != -1) {
                    fos.write(b);
                }
            } while (b != -1);
        }catch(IOException e){
            e.printStackTrace();
        }

        long end = System.nanoTime();
        return(end-start);
    }

    public static long CopyBuffered(String path){
        long start = System.nanoTime();
        try(FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream("copyBuffered.mp3");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
        ){
            int b;
            do{
                b = fis.read();
                if(b!=-1){
                    bos.write(b);
                }
            }while(b != -1);

        }catch(IOException e){
            e.printStackTrace();
        }
        long end = System.nanoTime();
        return(end-start);
    }
    public static long CopyArraywiseUnbuffered(String path){
        long start = System.nanoTime();
        try(FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream("copyArray.mp3");
        ){
            byte[] b = new byte[1024];
            int a;
            do{
                a = fis.read(b);
                if(a != -1){
                    fos.write(b, 0, a);
                }
            }while(a != -1);
        }catch(IOException e){
            e.printStackTrace();
        }
        long end = System.nanoTime();

        return(end - start);
    }

    public static void main(String[] args) {
        long o1 = Copyunbuffered("copy.mp3");
        long o2 = CopyBuffered("copy.mp3");
        long o3 = CopyArraywiseUnbuffered("copy.mp3");
        long sum = o1 + o2 + o3;
        double anteil1 =  (100 /(double) sum) * o1;
        double anteil2 =  (100 / (double) sum) * o2;
        double anteil3 =  (100 / (double) sum) * o3;


        System.out.println("Time unbuffered bytewise: \t" + o1 + "\t\t Anteil: " + anteil1 + " %") ;
        System.out.println("Time buffered bytewise: \t" + o2+ "\t\t Anteil: " + anteil2 + " %");
        System.out.println("Time unbuffered arraywise:\t" + o3+ "\t\t\t Anteil: " + anteil3  + " %");

    }

}
