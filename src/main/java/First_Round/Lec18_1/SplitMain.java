package First_Round.Lec18_1;

public class SplitMain {
    public static void main(String[] args) {
        try {
            StudiengangSplitter.splitStudiengaenge("Matrikelnummern.txt");
        }catch(MatrikelNummerException e){
            e.printStackTrace();
        }
    }
}
