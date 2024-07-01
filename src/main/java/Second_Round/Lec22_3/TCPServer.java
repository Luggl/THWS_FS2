package Second_Round.Lec22_3;

import First_Round.Lec22_3b.TCPServ;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TCPServer {
    final int PORT = 5050;

    public void init(){
        try(ServerSocket ss = new ServerSocket(PORT);
        ){
            while(true){
                ServerThread st = new ServerThread(ss.accept());
                st.start();
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public class ServerThread extends Thread{
        Socket socket;
        public ServerThread(Socket socket){
            this.socket = socket;
        }

        private Boolean isPrime(int num){
            if (num < 2) return false;
            for (int divisor = 2; divisor < num; divisor++)
                if (num % divisor == 0) return false;
            return true;
        }

        private Map<Integer, Boolean> getMap(ArrayList<Integer> numbers){
            Map<Integer, Boolean> out = new HashMap<>();
            for(Integer num : numbers){
                out.put(num, isPrime(num));
            }
            return(out);

        }

        public void run(){
            try(ObjectInputStream ois  = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ){
                ArrayList<Integer> numbers = (ArrayList<Integer>) ois.readObject();
                oos.writeObject(getMap(numbers));
                oos.flush();
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        TCPServer server = new TCPServer();
        server.init();
    }
}
