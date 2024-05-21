package Lec18_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private static final int PORT = 5000;

    private static void getClientInput(){
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        ){
            System.out.println("accept done");
            br.readLine();
            bw.write("ok");
            System.out.println("ok write");
            bw.newLine();
            System.out.println("newLine sent");
            bw.flush();
            System.out.println("flushed");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getClientInput();
    }
}
