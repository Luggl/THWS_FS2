package Klausur2020SS.Aufgabe2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TextServer<E extends Game> {
    E g;
    public TextServer(E g) {
        this.g = g;
        g.reset(); //starts new Game
    }
    public void start() throws IOException {
        try (ServerSocket ss = new ServerSocket(5000);) {
            try (Socket connection = ss.accept();) {
                handleConnection(connection);
            }
        }
    }
    private void handleConnection(Socket connection) throws IOException {
        try (BufferedReader fromClient = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             BufferedWriter toClient = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
             ) {
            String line = fromClient.readLine();
            if (line.equals(g.initGameString())) {
                writeToClient(toClient, g.welcomeString());
                play(fromClient, toClient);
            }
        }
    }

    protected void play(BufferedReader fromClient, BufferedWriter toClient) throws IOException {
        do {
            String line = fromClient.readLine();
            if (line == null) break;
            writeToClient(toClient, g.handleInput(line));
        }
        while (g.running());
    }
    protected static void writeToClient(BufferedWriter toClient, String s) throws IOException {
        try{
            toClient.write(s+"\n");
            toClient.flush();
        }catch(IOException e){
            throw new IOException("Failed writeToClient");
        }

    }
    public static void main(String[] args) throws IOException
    {
//        Aufgabe b)
        do{
            TextServer server = new TextServer(new GameGalgenmaennchen());
            try {
                server.start();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }while(true);
    }
}
