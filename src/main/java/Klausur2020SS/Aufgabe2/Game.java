package Klausur2020SS.Aufgabe2;

public interface Game {
     void reset();
     String initGameString();
     String welcomeString();
     String handleInput(String in);
     boolean running();
}
