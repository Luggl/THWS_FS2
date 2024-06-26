package Second_Round.Lec19_1;

import java.io.Serializable;

public class Answer implements Serializable {
    String answer;
    int tries;
    int fails;

    public Answer(int tries, int fails, boolean hit, String status){
        boolean done = true;
        this.tries = tries;
        this.fails = fails;
        for(char c : status.toCharArray()){
            if(c == '_'){
                done = false;
            }
        }
        if(done){
            this.answer = "You did it! Congrats! End of Game\n";
        }else{
            if(tries >=15){
                this.answer = "Too many tries! End of Game\n";
            }else if(fails >= 5){
                this.answer = "Too many fails! End of Game\n";
            }else {
                if(hit){
                    this.answer = "Good job! Your status: " + status + "\t\tTries: " + tries + "\t\tFails: " + fails + "\n";
                }else{
                    this.answer = "No Luck! Your status: " + status + "\t\tTries: " + tries + "\t\tFails: " + fails + "\n";
                }
            }
        }
    }

}
