package Lec18_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    static Hangman h = new Hangman();
    private static final int PORT = 5000;

    private static void init(){
        h.init();
    }

    public static void main(String[] args) {
        init();
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            BufferedReader br = new BufferedReader(isr);
            ) {

                System.out.println("Connection done");
                do{
                    char userTry = br.readLine().charAt(0);
                    System.out.println("got Client Input");
                    h.tryGuess(userTry);

                    String out = "Hangman -- aktueller Zustand:\n" +
                            "Anzahl Versuche: " + h.getTryCount() +"\n" +
                            "Anzahl Fehler: + " + h.getFailCount() + "\n" +
                            "Aktueller Lösungszustand: " + String.valueOf(h.getUserTry());
                    bw.write(out);
                    bw.newLine();
                    bw.flush();
                    System.out.println("wrote out");
                    bw.write(h.getTryCount());
                    bw.newLine();
                    bw.flush();
                    bw.write(h.getFailCount());
                    bw.newLine();
                    bw.flush();

                }while(true);


            }catch(Exception e){
                e.printStackTrace();
        }
    }

}
