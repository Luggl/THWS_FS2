package Lec18_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class TCPServer {
    public static void main(String[] args) {

        final int PORT = 5000;
        Hangman h = new Hangman();
        h.initWord();

        try(ServerSocket ss = new ServerSocket(PORT);
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            BufferedReader br =  new BufferedReader(new InputStreamReader(is));
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));){

            do{
                String guess = br.readLine();
                if(guess == null){
                    break;
                }else{
                    bw.write("angekommen");
                    bw.flush();
                    bw.write(h.Try(guess));
                    bw.flush();
                }

            }while(h.tryCount <=15 && h.failsCount <=10);

        }catch(Exception e){
            e.printStackTrace();
        }

    }



}
