package First_Round.Lec17_3;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMethods {
    public static long CopyArraywiseUnbufferedDuration(String path) throws IOException {
        long startTime = System.nanoTime();

        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        byte[] b = new byte[1024];
        int n;
        do {
            n = fis.read(b);
            if(n!=-1){
                fos.write(b, 0, n);
            }
        } while (n!=-1);

        fis.close();
        fos.close();

        long endTime = System.nanoTime();
        return (endTime - startTime);
    }

    public static long CopyBytewiseBufferedDuration(String path) throws IOException {
        long startTime = System.nanoTime();

        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;

        do {
            b = fis.read();
            if (b != -1) {
                bos.write(b);
            }
        } while (b != -1);

        fis.close();
        fos.close();

        long endTime = System.nanoTime();
        return(endTime - startTime);
    }

    public static long CopyBytewiseUnbufferedDuration(String path) throws IOException {
        long startTime = System.nanoTime();

        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        int b;

        do {
            b = fis.read();
            if (b != -1) {
                fos.write(b);
            }
        } while (b != -1);

        fis.close();
        fos.close();

        long endTime = System.nanoTime();
        return(endTime - startTime);
    }
}
