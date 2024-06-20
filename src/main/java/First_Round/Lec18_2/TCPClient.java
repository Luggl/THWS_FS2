package First_Round.Lec18_2;

import java.io.*;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class TCPClient {
    private static final int PORT = 5050;
    private static final String HOST = "localhost";
    static String firstmsg =
            "Welcome to Hangman!\n" +
                    "Games rules should be known";
    static String getUserInput = "Give me your try";
    static char userGuess;

    public static void main(String[] args) {
        try(Socket socket = new Socket(HOST, PORT);
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            Scanner scanner = new Scanner(System.in);
        ){
            if(socket.isConnected()){
                System.out.println("Connection accepted. Waiting for Server");
            }
            String serverMessage = br.readLine();
            System.out.println(serverMessage);

            System.out.println(firstmsg);

            do{
                System.out.println(getUserInput);
                String userTry = scanner.nextLine();
                if(userTry.equals("end")){
                    break;
                }
                userGuess = userTry.charAt(0);
                bw.write(userGuess + "\n");
                bw.flush();
                String answer1 = br.readLine();
                String zwischenstand = br.readLine();
                String left = br.readLine();
                System.out.println(answer1);
                if(answer1.equals("You won!") || answer1.equals("You lost!")){
                    break;
                }else{
                    System.out.println(zwischenstand);
                    System.out.println(left);
                }

            }while(true);
        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
