package Klausur2020SS_2.Aufgabe2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TextServer {
    GameGalgenmaennchen g;
    public TextServer(GameGalgenmaennchen g) {
        this.g = g;
        g.reset(); //starts new Game
    }
    public void start() throws IOException
    {
        try (ServerSocket ss = new ServerSocket(5000);)
        {
            try(Socket connection = ss.accept();)
            {
                handleConnection(connection);
            }
        }
    }
    private void handleConnection(Socket connection) throws IOException
    {
        try(BufferedReader fromClient = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
            BufferedWriter toClient = new BufferedWriter(
                    new OutputStreamWriter(connection.getOutputStream()));)
        {
            String line = fromClient.readLine();
            if (line.equals(g.initGameString()))
            {
                writeToClient(toClient, g.welcomeString());
                play(fromClient, toClient);
            }
        }
    }
    protected void play(BufferedReader fromClient, BufferedWriter toClient)
            throws IOException {
        do {
            String line = fromClient.readLine();
            if (line == null) break;
            writeToClient(toClient, g.handleInput(line));
        }
        while (g.running());
    }
    protected static void writeToClient(BufferedWriter toClient, String s)
            throws IOException {
        toClient.write(s+"\n");
        toClient.flush();
    }
    public static void main(String[] args) throws IOException
    {
        TextServer server = new TextServer(new GameGalgenmaennchen());
        server.start();
    }
}
