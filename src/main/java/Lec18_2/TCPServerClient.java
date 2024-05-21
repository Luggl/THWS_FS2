package Lec18_2;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerClient {
    private static final int PORT = 5000;
    private static final String HOST = "localhost";

    private static void sendToServer(String s){
        try(Socket socket = new Socket(HOST, PORT);
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            InputStream is = socket.getInputStream();
            ){
            bw.write(s);
            System.out.println("write done");
            bw.flush();
            System.out.println("flush done");
            bw.newLine();
            System.out.println("newLine done");
            System.out.println(is.read());
            System.out.println("read done");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String toSend = "";
        do{
            toSend = scanner.nextLine();
            sendToServer(toSend);
        }while(!(toSend.equals("X")) && !(toSend.equals("x")));
    }
}
