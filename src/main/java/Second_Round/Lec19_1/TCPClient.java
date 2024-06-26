package Second_Round.Lec19_1;

import javax.sound.sampled.Port;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private static final int PORT = 5050;
    private static final String HOST = "localhost";

    private static void game(){
        System.out.println("Welcome to Hangman!");
        try(Socket socket = new Socket(HOST, PORT);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Scanner scanner = new Scanner(System.in);
        ){
            if(socket.isConnected()){
                System.out.println("connection established");
            }
            while(true){
                System.out.println("Give me your Guess: ");
                Guess g = new Guess(scanner.next().charAt(0));
                oos.writeObject(g);
                oos.flush();
                Answer a = (Answer) ois.readObject();
                String answer = a.answer;
                System.out.println(answer);
                if(answer.contains("End of Game")){
                    break;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        game();
    }
}
