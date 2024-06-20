package First_Round.Lec17_4;

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
        }

    }

    public static void main(String[] args){
        String s = "Far out in the uncharted backwaters of the unfashionable end of the Western Spiral Arm of the Galaxy lies a small unregarded yellow sun.\n" +
                "\n" +
                "Orbiting this at a distance of roughly ninety-two million miles is an utterly insignificant little blue-green planet whose ape-descended life forms are so amazingly primitive that they still think digital watches are a pretty neat idea.";

        FileOutputStream y = null;
        FileOutputStream z = null;
        OutputStreamDoubler o = null;

        try {
            y = new FileOutputStream("File1.txt");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            z = new FileOutputStream("File2.txt");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        if(y != null && z != null) {
            o = new OutputStreamDoubler(y, z);
        }

        try {
            byte[] ba = s.getBytes();
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
