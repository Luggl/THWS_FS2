package First_Round.Klausurvorbereitung.GZIP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class GZIPClient {
    public static void main(String[] args) throws IOException {
        byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
        Socket connectionToHost = new Socket("localhost", 5555);
        OutputStream os = connectionToHost.getOutputStream();
        GZIPOutputStream gos = new GZIPOutputStream(os);
        try{
            gos.write(bytesToTransfer);
        }catch (Exception e){
            throw new IOException("failed to write");
        }
        gos.close();
        os.close();
        connectionToHost.close();

    }
}


