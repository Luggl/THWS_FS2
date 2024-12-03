package First_Round.Klausurvorbereitung.GZIP;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

public class GZIPServer {
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(5555);
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            GZIPInputStream gis = new GZIPInputStream(is)
        ){

            System.out.println(new String(gis.readAllBytes()));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
