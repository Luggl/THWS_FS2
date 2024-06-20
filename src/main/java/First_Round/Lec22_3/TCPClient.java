package First_Round.Lec22_3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Map;

public class TCPClient {

    public static int[] getInts(){
        int[] integers = new int[250];
        for(int i = 0; i<250; i++){
            integers[i] = (int) ((Math.random() + 1) * 6859632);
        }
        return(integers);
    }

    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 5000);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ){
            if(socket.isConnected()){
                String[] a = {""};
                TCPClient2.main(a);
                oos.writeObject(getInts());
                oos.flush();
                Map<Integer, Boolean> m = (Map<Integer, Boolean>) ois.readObject();
                for(Integer i : m.keySet()){
                    System.out.println(i + " -> " + m.get(i));
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
