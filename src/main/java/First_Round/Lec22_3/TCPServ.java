package First_Round.Lec22_3;

import java.net.ServerSocket;

public class TCPServ {

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
