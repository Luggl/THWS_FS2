package First_Round.Lec18_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServer {
    private static final int PORT = 5050;
    static int triesLeft = 15;
    static int failsLeft = 5;
    static String[] words = {"Apfelsaft", "Zimtschnecke", "Waldfee", "Magensaeure"};
    static char[] wordToGuess = words[(int)(Math.random() * words.length)].toCharArray();
    static char[] userTry = new char[wordToGuess.length];

    private static boolean processGuess(char g){
        boolean fail = true;
        for(int i = 0; i< wordToGuess.length; i++){
            if(Character.toUpperCase(g) == Character.toUpperCase(wordToGuess[i])){
                userTry[i] = wordToGuess[i];
                fail = false;
            }
        }
        if(fail){
            failsLeft--;
        }
        triesLeft--;
        return(fail);
    }
    public static void main(String[] args) {

        Arrays.fill(userTry, '_');

        try(ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        ){
            if(connection.isConnected()){
                bw.write("Connection established!" + "\n");
                bw.flush();
            }else{
                return;
            }

            do{
                char guess = br.readLine().charAt(0);
                boolean fail = processGuess(guess);
                if(fail){
                    if(failsLeft < 0 || triesLeft < 0){

                        bw.write("You lost!" + "\n");
                        bw.flush();
                        break;
                    }
                    bw.write("Sorry, no Luck!" + "\n");
                    bw.flush();
                }else{
                    if(Arrays.toString(wordToGuess).equals(Arrays.toString(userTry))){
                        bw.write("You won!" + "\n");
                        bw.flush();
                        break;
                    }
                    bw.write("Great job!" + "\n");
                    bw.flush();
                }
                if(triesLeft < 0){
                    break;
                }
                bw.write("aktueller Zwischenstand: " + String.valueOf(userTry) + "\n");
                bw.flush();
                bw.write(triesLeft + " Versuche über und " + failsLeft + " Fehler über" + "\n");
                bw.flush();

            }while(true);


        }catch(Exception e ){
            e.printStackTrace();
        }
    }
}
