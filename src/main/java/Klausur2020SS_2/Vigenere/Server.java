package Klausur2020SS_2.Vigenere;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    Vigenere v;
    private final int PORT = 5050;

    private void init(){
        try(FileInputStream fis = new FileInputStream("geheimnis.oos");
            ObjectInputStream ois = new ObjectInputStream(fis);
        ){
            v = (Vigenere) ois.readObject();
            initServer();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    private void initServer(){
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket socket = ss.accept()
        ){
            communicate(socket);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void communicate(Socket socket){
        try(InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            Scanner scanner = new Scanner(System.in)
        ){
            while(socket.isConnected()) {
                String message = br.readLine();

                System.out.println("Vom Client: " + message + "-> " + v.dechiffre(message));
                System.out.println("Bitte Antwort zum Client eingeben: ");
                String userInput = scanner.nextLine();
                String encryptedUserInput = v.chiffre(userInput);
                System.out.println(userInput + " -> " + encryptedUserInput);
                bw.write(encryptedUserInput + "\n");
                bw.flush();
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server s = new Server();
        s.init();
    }
}
