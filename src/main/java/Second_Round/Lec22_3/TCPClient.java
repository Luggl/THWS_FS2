package Second_Round.Lec22_3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;

public class TCPClient {
    final int PORT = 5050;
    final String HOST = "localhost";

    private ArrayList<Integer> getNumbers(){
        ArrayList<Integer> out = new ArrayList<>();
        for(int i = 0; i < 200; i++){
            out.add((int) (Math.random() * 8976 + 2));
        }
        return(out);
    }

    private void init(){
        try(Socket socket = new Socket(HOST, PORT);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ){
            oos.writeObject(getNumbers());
            oos.flush();
            Map<Integer, Boolean> answer = (Map<Integer, Boolean>) ois.readObject();
            for(Integer key : answer.keySet()){
                System.out.println(key + "\t-->\t" + answer.get(key));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TCPClient client = new TCPClient();
        client.init();
    }
}





