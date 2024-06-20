package First_Round.Lec21_4;

public class Question {
    String text; //Fragentext

    //Wandelt eine eingelesene Zeile in ein Question-Objekt um
    public static Question toQuestion(String line) {
        Question out = new Question();
        out.text = line;
        return(out);
    }
}
