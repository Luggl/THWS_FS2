package First_Round.Lec18_4;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(5555);
            Socket connection = ss.accept();
            InputStream is =connection.getInputStream();
            GZIPInputStream gis = new GZIPInputStream(is);
        ){
            byte[] in = gis.readAllBytes();
            String s = new String(in, StandardCharsets.UTF_8);
            System.out.println(s);


        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
