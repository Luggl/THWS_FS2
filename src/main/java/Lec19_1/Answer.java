package Lec19_1;

public class Answer {
    static String text;
    static boolean wordDone = false;
    static boolean charHit;
    static boolean gameEnded = false;

    public Answer(String text, boolean wordDone, boolean charHit, boolean gameEnded){
        this.text = text;
        this.wordDone = wordDone;
        this.charHit = charHit;
        this.gameEnded = gameEnded;
    }
}
