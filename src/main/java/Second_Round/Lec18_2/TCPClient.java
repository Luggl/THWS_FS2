package Second_Round.Lec18_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private final int PORT = 5050;
    private final String HOST = "localhost";

    private void game(){
        System.out.println("Welcome to Hangman");
        try(Socket socket = new Socket(HOST, PORT);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner scanner = new Scanner(System.in);
        ){
            System.out.println(br.readLine());
            while(true){
                String status = br.readLine();
                System.out.println(status);
                System.out.println("Give me your Guess: ");
                char guess = scanner.nextLine().charAt(0);
                bw.write(guess + "\n");
                bw.flush();
                String result = br.readLine();
                System.out.println(result);
                if(result.startsWith("Sorry, you lost") || result.startsWith("Congratulations")){
                    break;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TCPClient client = new TCPClient();
        client.game();
    }
}
