package Lec17_4;

import java.io.*;

public class OutputStreamDoubler {
    OutputStream a;
    OutputStream b;

    public OutputStreamDoubler(OutputStream a, OutputStream b){
        this.a = a;
        this.b = b;
    }

    public void close() throws IOException {
        try {
            a.close();
        }catch(IOException e){
            throw new IOException("Outputstream a failed");
        }
        try {
            b.close();
        }catch(IOException e){
            throw new IOException("Outputstream b failed");
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

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream z = new FileOutputStream("file1.txt");;
        FileOutputStream y = new FileOutputStream("file2.txt");
        OutputStreamDoubler o = new OutputStreamDoubler(z, y);

        try {

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

            o.close();
        }catch(IOException e){
                e.printStackTrace();
        }
    }
}
