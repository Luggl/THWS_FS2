package Klausur2020SS_2.Vigenere;

import java.io.*;
import java.net.Socket;
import java.security.cert.PKIXCertPathBuilderResult;
import java.util.Scanner;

public class Client {
    private final int PORT = 5050;
    private final String HOST = "localhost";
    Vigenere v;

    public Client(){
        init();
    }
    private void init(){
        try(FileInputStream fis = new FileInputStream("geheimnis.oos");
            ObjectInputStream ois = new ObjectInputStream(fis);
        ){
            v = (Vigenere) ois.readObject();
            initClient();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void initClient(){
        try(Socket socket = new Socket(HOST, PORT);
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
                System.out.println("Bitte Nachricht zum Server eingeben:");
                String message = scanner.nextLine();
                String encrypted = v.chiffre(message);
                System.out.println(message + " -> " + encrypted);
                bw.write(encrypted + "\n");
                bw.flush();
                String in = br.readLine();
                String decrypted = v.dechiffre(in);
                System.out.println("vom Server: " + in + " -> " + decrypted);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.init();
    }
}
