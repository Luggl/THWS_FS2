package Lec19_1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class TCPClient {
    final static int PORT = 5025;
    final static String HOST = "localhost";
    static String firstmsg =
            "Welcome to Hangman!\n" +
                    "Games rules should be known";
    static String getUserInput = "Give me your try\t\t -->";

    public static void main(String[] args) {

        try(Socket socket = new Socket(HOST, PORT);
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            ObjectInputStream ois = new ObjectInputStream(is);
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
                    System.out.println("End of Program");
                    break;
                }
                oos.writeObject(new Rateversuch(userTry.charAt(0)));
                Answer a = (Answer) ois.readObject();
                System.out.println("Aktueller Zustand: " + a.getCurrent());
                System.out.println(a.gettextAnswer());
                System.out.println("Tries left: " + a.getTriesLeft());
                System.out.println("Fail left: " + a.getFailsLeft());
                System.out.println();
                boolean gameEnd = a.isGameEnded();
                boolean wordDone = a.isWordDone();

                if(gameEnd || wordDone){
                    break;
                }



            }while(true);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
