package Lec19_1;

import java.io.Serializable;

public class Answer implements Serializable {
    private String current;
    private String textAnswer;
    private boolean wordDone = false;
    private boolean charHit;
    private boolean gameEnded = false;
    private int failsLeft;
    private int triesLeft;

    public Answer(String current, boolean charHit, boolean wordDone, boolean gameEnded, int failsLeft, int triesLeft){
        this.current = current;
        this.triesLeft = triesLeft;
        this.failsLeft = failsLeft;
        if(wordDone) {
            this.wordDone = true;
            this.gameEnded = true;
            this.textAnswer = "Nice - you won!";
        }else if(gameEnded){
            this.gameEnded = true;
            this.textAnswer = "Bad luck! You lost!";
        }else if(charHit){
            this.charHit = true;
            this.textAnswer = "Good job! ";
        }else{
            this.charHit = false;
            this. textAnswer = "Better luck next time!";
        }

    }
    public String gettextAnswer(){
        return(this.textAnswer);
    }
    public boolean isWordDone(){
        return(this.wordDone);
    }
    public boolean isCharHit(){
        return(this.charHit);
    }
    public boolean isGameEnded(){
        return(gameEnded);
    }
    public String getCurrent(){
        return(current);
    }
    public int getFailsLeft(){
        return(failsLeft);
    }
    public int getTriesLeft(){
        return(triesLeft);
    }

}
