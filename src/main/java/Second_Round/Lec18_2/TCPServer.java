package Second_Round.Lec18_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServer {
    private final int PORT = 5050;
    String[] words = new String[]{"Kartoffelsalat", "Tortelloni","Beispielwort", "Kampfhelikopter"};
    char[] wordToGuess;
    char[] userGuess;
    int tries = 0;
    int fails = 0;

    private void initWord(){
        wordToGuess = words[ (int) (Math.random() * words.length)].toCharArray();
        userGuess = new char[wordToGuess.length];
        for(int i = 0; i< userGuess.length; i++){
            userGuess[i] = '_';
        }
    }

    private boolean tryGuess(char c){
        boolean fail = true;
        for(int i = 0; i< wordToGuess.length; i++){
                if(Character.toUpperCase(c) == Character.toUpperCase(wordToGuess[i])){
                    fail = false;
                    userGuess[i] = wordToGuess[i];
                }
        }
        return(fail);

    }

    private String countGuess(boolean fail){
        if(Arrays.equals(userGuess, wordToGuess)){
            return("Congratulations! You won and your are awesome!\n");
        }else if(fails >= 5 || tries >= 12) {
            return ("Sorry, you lost -> Fails: " + fails + "\t\tTries: " + tries);
        }else if(fail){
            fails++;
            tries++;
            return("Sorry, better Luck next time!\n");
        }else{
            tries++;
            return("Good Guess!\n");
        }
    }

    private void initGame(){
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket socket = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                ){
            if(socket.isConnected()){
                bw.write("Welcome on Board!\n");
                bw.flush();
            }
            while(true){
                    String status = new String(userGuess);
                    bw.write("Your status: " + status + "\t\tTries: " + tries + "\t\tFails: " +fails + "\n");
                    bw.flush();
                    char g = br.readLine().charAt(0);
                    String out = countGuess(tryGuess(g));
                    bw.write(out);
                    bw.flush();
                    if(out.startsWith("Sorry, you lost") || out.startsWith("Congratulations")){
                        break;
                    }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TCPServer server = new TCPServer();
        server.initWord();
        server.initGame();
    }

}
