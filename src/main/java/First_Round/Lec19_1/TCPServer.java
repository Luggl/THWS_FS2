package First_Round.Lec19_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServer {

    static final int PORT = 5025;
    public static int triesLeft = 15;
    public static int failsLeft = 5;
    static String[] words = {"Apfelsaft", "Zimtschnecke", "Waldfee", "Magensaeure"};
    static char[] wordToGuess = words[(int)(Math.random() * words.length)].toCharArray();
    static char[] userTry = new char[wordToGuess.length];

    private static String getUserTry(){
        return(String.valueOf(userTry));
    }

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
            OutputStream os = connection.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            ObjectInputStream ois = new ObjectInputStream(is);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        ){
            if(connection.isConnected()){
                System.out.println("Connection established.");
                bw.write("Welcome on Board Stranger\n");
                bw.flush();
            }

            do{
                Rateversuch r = (Rateversuch) ois.readObject();
                char guess = r.guess;
                boolean fail = processGuess(guess);
                if(fail){
                    if(failsLeft < 0 || triesLeft < 0){

                        oos.writeObject(new Answer(getUserTry(), false, false, true, failsLeft, triesLeft));
                        break;
                    }else{
                        oos.writeObject(new Answer(getUserTry(), false, false, false, failsLeft, triesLeft));
                    }
                }else{
                    if(Arrays.toString(wordToGuess).equals(Arrays.toString(userTry))){
                        oos.writeObject(new Answer(getUserTry(), true, true, false, failsLeft, triesLeft));
                        break;
                    }else{
                        oos.writeObject(new Answer(getUserTry(), true, false, false, failsLeft, triesLeft));
                    }

                }

            }while(true);


        }catch(Exception e){
            e.printStackTrace();
        }

    }


}
