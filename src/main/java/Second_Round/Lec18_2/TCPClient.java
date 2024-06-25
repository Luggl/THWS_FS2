package Second_Round.Lec18_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    final int PORT = 5050;
    final String HOST = "localhost";

    public void init(){
        System.out.println("initializing");

        try(Socket socket = new Socket(HOST, PORT);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ){
            System.out.println("done init");
            System.out.println(br.readLine());
            Scanner scanner = new Scanner(System.in);
            do{
                bw.write(scanner.nextLine());
                bw.newLine();
                bw.flush();
            }while(true);

        }catch(Exception e ){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TCPClient serv = new TCPClient();
        serv.init();
    }
}
