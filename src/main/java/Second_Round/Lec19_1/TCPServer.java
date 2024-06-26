package Second_Round.Lec19_1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServer {
    private static final int PORT = 5050;

    static String[] words = new String[]{"Kartoffelsalat", "Zitronenlimo", "Puffreis", "Kranplätze", "Verdichtung"};
    static char[] wordToGuess;
    static char[] userGuess;
    static int tries = 0;
    static int fails = 0;

    private static Answer checkGuess(Guess g){
        char guess = g.guess;
        boolean hit = false;
        tries ++;
        for(int i = 0; i< wordToGuess.length; i++){
            if(Character.toUpperCase(guess) == Character.toUpperCase(wordToGuess[i])){
                userGuess[i] = wordToGuess[i];
                hit = true;
            }
        }
        if(!hit){
            fails++;
        }
        Answer answer = new Answer(tries, fails, hit, String.valueOf(userGuess));
        return(answer);
    }

    private static void initGame(){
        wordToGuess = words[(int) (Math.random() * words.length)].toCharArray();
        userGuess = new char[wordToGuess.length];
        Arrays.fill(userGuess, '_');

        try(ServerSocket ss = new ServerSocket(PORT);
            Socket socket = ss.accept();
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ){
            if(socket.isConnected()){
                System.out.println("connection established");
            }
            while(true) {
                Guess userguess = (Guess) ois.readObject();
                oos.writeObject(checkGuess(userguess));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        initGame();
    }

}
