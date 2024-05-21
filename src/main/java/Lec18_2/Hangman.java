package Lec18_2;

import java.util.Arrays;

public class Hangman {
    private int tryCount;
    private int failCount;
    private char[] wordToGuess;
    private char[] userTry;
    private String[] words = {"Suppenkasper", "Ananassaft", "Fentanylueberdosis", "Juckpulver", "Granatapfel", "Melatonin"};

    public void init(){
        wordToGuess = words[(int) (Math.random()*words.length)].toCharArray();
        userTry = new char[wordToGuess.length];
        Arrays.fill(userTry, '_');
        tryCount = 1;
        failCount = 0;
    }

    public char[] getUserTry(){
        return(userTry);
    }

    public int getTryCount(){
        return (tryCount);
    }

    public int getFailCount(){
        return(failCount);
    }

    public void tryGuess(char in){
        boolean fail = true;
        for(int i = 0; i< wordToGuess.length; i++){
            if(in == wordToGuess[i]){
                userTry[i] = wordToGuess[i];
                fail = false;
            }
        }
        if(fail){
            failCount++;
        }
        tryCount++;
    }

}
