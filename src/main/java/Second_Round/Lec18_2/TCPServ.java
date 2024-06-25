package Second_Round.Lec18_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServ {
    private final int PORT = 5050;

    public void init(){
        System.out.println("initializing");
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket socket = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))
        ){
            System.out.println("accepted!");
            bw.write("Welcome on board");
            bw.newLine();
            bw.flush();
            do{
                String in = br.readLine();
                bw.write("ok");
                bw.newLine();
                bw.flush();
                System.out.println(in);
            }while(true);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TCPServ client = new TCPServ();
        client.init();
    }


}
