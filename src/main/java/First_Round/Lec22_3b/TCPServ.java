package First_Round.Lec22_3b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class TCPServ {

    private static class SocketThread extends Thread{
        Socket socket;


        public SocketThread(Socket socket){
            this.socket = socket;
        }

        public boolean testeObPrimzahl(int zahlZumTesten) {
            if (zahlZumTesten < 2) return false;
            for (int divisor = 2; divisor < zahlZumTesten; divisor++)
                if (zahlZumTesten % divisor == 0) return false;
            return true;
        }

        @Override
        public void run(){
            int[] ints;
            Map<Integer, Boolean> m = new HashMap<>();

            try(
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ){
                ints = (int[]) ois.readObject();
                for(Integer i : ints){
                    m.put(i, testeObPrimzahl(i));
                }
                oos.writeObject(m);
                oos.flush();

            }catch(Exception e){
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {

        try (ServerSocket ss = new ServerSocket(5000);
        ) {
            while(true) {
                SocketThread st = new SocketThread(ss.accept());
                st.start();
            }


        } catch (Exception e) {

        }
    }
}
