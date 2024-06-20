package First_Round.Lec15_3;

public class Quiz {
    public static void main(String[] args) {
        Textfrage a = new Textfrage("Was ist die Hauptstadt von Deutschland?");
        Textfrage b = new Textfrage("Wieviele ECTS Punkte benötigst du bis zum zweiten Semester?");
        MultipleChoice c = new MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?");
        MultipleChoice d = new MultipleChoice("Wie viele Gliedmaßen hat ein Hund?");
        MultipleChoice e = new MultipleChoice("In welchem Semester bist du?");

        Frage[] quiz = {a, b, c, d, e};
        for(int i = 0; i < quiz.length; i++){
            System.out.println(quiz[i]);
        }

    }

}
