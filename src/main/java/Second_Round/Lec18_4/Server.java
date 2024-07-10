package Second_Round.Lec18_4;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

public class Server {

    public void init(){
        try(ServerSocket ss = new ServerSocket(5555);
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            GZIPInputStream gis = new GZIPInputStream(is)
        ){
            if(socket.isConnected()){
                System.out.println("connected");
               byte[] in = gis.readAllBytes();
                String out = new String(in, StandardCharsets.UTF_8);
                System.out.println(out);

            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.init();
    }

}
