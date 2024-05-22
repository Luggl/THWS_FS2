package Lec19_1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    static String firstmsg =
            "Welcome to Hangman!\n" +
                    "Games rules should be known";
    static String getUserInput = "Give me your try";
    static char userGuess;

    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost", 5050);
            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Scanner scanner = new Scanner(System.in);
        ){
            if(socket.isConnected()){
                System.out.println("Connection accepted. Waiting for Server");
            }
            String serverMessage = br.readLine();
            System.out.println(serverMessage);

            System.out.println(firstmsg);

            do {
                System.out.println(getUserInput);
                String userTry = scanner.nextLine();
                if(userTry.equals("end")){
                    break;
                }
                oos.writeObject(new Rateversuch(userTry.charAt(0)));
                Answer a = (Answer) ois.readObject();


            }while(true);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
