package Lec18_2;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public char[] wordToGuess;
    public char[] userTry;
    public int tryCount = 1;
    public int failsCount = 0;

    public void initWord(){
        String[] words = {"Kegelbahn", "Burnout", "Poempel", "Taxifahrer", "Knoefte", "Schabeltier", "Stümper", "Rumpelkammer"};
        wordToGuess = words[(int)(Math.random() * words.length)].toCharArray();
        userTry = new char[wordToGuess.length];
        Arrays.fill(userTry, '_');
    }

    private String tryGuess(String s){
        String out = "";
        boolean foundAChar = false;
        char[] guess = s.toCharArray();
        if(guess.length == 1){
            for(int i = 0; i< wordToGuess.length; i++){
                if(guess[0] == wordToGuess[i]){
                    foundAChar = true;
                    userTry[i] = wordToGuess[i];
                }
            }
            if(foundAChar) {
                tryCount++;
                out = "Good job! \t" + Arrays.toString(userTry);
            }else{
                tryCount++;
                failsCount++;
                out = "Nah, try again! \t" + Arrays.toString(userTry);
            }

        }else if(guess.length > 0){
            if(Arrays.toString(guess).equals(Arrays.toString(wordToGuess))){
                out = "Awesome - You did it! \nThe final Word is: " + Arrays.toString(wordToGuess);
            }else{
                tryCount++;
                failsCount++;
                out = "Nah, try again! \t" + Arrays.toString(userTry);
            }

        }

        return(out);
    }

    public String Try(String s){
        String out = "";
        if(tryCount <= 12 && failsCount <= 10){
            out = tryGuess(s);
        }else{
            out = "You lost!";
        }

        return(out);
    }


}

