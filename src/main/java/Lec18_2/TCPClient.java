package Lec18_2;

import javax.sound.sampled.Port;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private static final int PORT = 5000;
    private static final String HOST = "localhost";


    public static void main(String[] args) {
        System.out.println("Herzlich willkommen zu Hangman!");
        Scanner scanner = new Scanner(System.in);

        try(Socket socket = new Socket(HOST, PORT);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));){
            int tryCount;
            int failCount;
            do{
                System.out.println("gib mir einen Buchstaben: ");
                char userGuess = scanner.nextLine().charAt(0);
                bw.write(userGuess);
                bw.newLine();
                bw.flush();
                System.out.println("write done");
                StringBuilder fromServer = new StringBuilder();
                while(br.readLine() != null){
                    fromServer.append(br.readLine());
                }
                System.out.println("got Server-Input");
                tryCount = Integer.parseInt(br.readLine());
                bw.write("Fails" + "\n");
                failCount = Integer.parseInt(br.readLine());

            }while(tryCount < 15 && failCount < 10);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
