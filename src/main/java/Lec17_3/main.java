package Lec17_3;

import java.io.IOException;
import java.util.Scanner;

import static Lec17_3.CopyMethods.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Bitte Path eingeben:   ");                          //C:\Users\llang\Music\Voicy_Nice_Meme.mp3
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        long dByteUnbuff = -1;
        long dByteBuff = -1;
        long dArrayUnbuff = -1;
        do{
            String path = scanner.next();
            try{
                dByteUnbuff = CopyBytewiseUnbufferedDuration(path);
                dByteBuff = CopyBytewiseBufferedDuration(path);
                dArrayUnbuff = CopyArraywiseUnbufferedDuration(path);
                stop = true;
            }catch (IOException e){
                System.out.println("Bitte erneut probieren - Path nicht korrekt");
            }
        }while(!stop);

        if(dByteBuff != -1 && dByteBuff != -1 && dArrayUnbuff != -1) {
            long sum = dByteBuff + dArrayUnbuff + dByteUnbuff;
            double dByteBuffPerc = (double) 100 / sum * dByteBuff;
            double dByteUnbuffPerc = (double) 100 / sum * dByteUnbuff;
            double dArrayUnbuffPerc = (double) 100 / sum * dArrayUnbuff;

            System.out.println("Dauer Bytewise Buffered: " + dByteBuff + " \t\t Anteil: " + String.format("%.2f", dByteBuffPerc));
            System.out.println("Dauer Bytewise Unbuffered: " + dByteUnbuff + " \t\t Anteil: " + String.format("%.2f", dByteUnbuffPerc));
            System.out.println("Dauer Arraywise Unbuffered: " + dArrayUnbuff + " \t\t Anteil: " + String.format("%.2f", dArrayUnbuffPerc));
        }else{
            System.out.println("Die Dauer wurde nicht korrekt berechnet");
        }
    }
}
