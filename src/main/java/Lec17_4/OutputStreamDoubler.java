package Lec17_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler {
    OutputStream a;
    OutputStream b;

    public OutputStreamDoubler(OutputStream a, OutputStream b){
        this.a = a;
        this.b = b;
    }

    public void close() throws IOException{
        try{
            if(a!=null){
                a.close();
            }
        }catch(IOException e){
            throw(new IOException("a could not be closed"));
        }
        try{
            if(b!=null){
                b.close();
            }
        }catch(IOException e){
            throw(new IOException("b could not be closed"));
        }
    }

    public void write(int b) throws IOException{
        try{
            a.write(b);
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            this.b.write(b);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            a.close();
            this.b.close();
        }

    }

    public static void main(String[] args) {
        FileOutputStream a;
        FileOutputStream b;

        try {
            a = new FileOutputStream("file1.txt");
            b = new FileOutputStream("file2.txt");
            OutputStreamDoubler o = new OutputStreamDoubler(a, b);

            byte[] ba = {1, 0, 11, 25, 35, 12, 1, 18, 't', -1};
            int n;
            for (int i = 0; i < ba.length; i++) {
                n = ba[i];
                try {
                    o.write(n);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(a!=null) {
                a.close();
            }
            if(b!=null) {
                b.close();
            }
        }


    }
}
