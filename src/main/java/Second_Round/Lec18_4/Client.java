package Second_Round.Lec18_4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class Client {
    public static void main(String[] args) throws IOException {

        byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
        try(Socket connectionToHost = new Socket("localhost", 5555);
            OutputStream os = connectionToHost.getOutputStream();
            GZIPOutputStream gos = new GZIPOutputStream(os);
            ){
            gos.write(bytesToTransfer);
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
