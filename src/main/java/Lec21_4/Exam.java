package Lec21_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Question> q = new ArrayList<>();

    //Liest den Tex-Header aus einer Datei u. gibt ihn als String zurück
    String readHeaderFromFile() {
        try(BufferedReader br = new BufferedReader(new FileReader("questions.csv"));
            ){

            return(br.readLine());

        }catch(Exception e){
            return(e.getMessage());
        }
    }

    public void readQuestions() throws IOException{

        try(BufferedReader br = new BufferedReader(new FileReader("questions.csv"))
        ){
            String readQuestion = br.readLine(); // first Line is Header!
            do{
                readQuestion = br.readLine();
                if(readQuestion == null){
                    break;
                }
                q.add(Question.toQuestion(readQuestion));

            }while(true);
        }catch(Exception e){
            throw(new IOException("Some Error"));
        }
    }

    public void toTest() throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.tex"))
        ){
            bw.write(readHeaderFromFile() + "\n");
            bw.flush();
            for(Question qu : q){
                bw.write("\\textbf{" + qu.text + "t}\\\\\n");
                bw.flush();
            }
            bw.write("\\end{document}\n");
            bw.flush();
        }catch(Exception e){
            throw(new IOException(e.getMessage()));
        }

    }

    public static void main(String[] args){
        Exam e = new Exam();

        try{
            e.readQuestions();
            e.toTest();
        }catch(Exception x){
            x.printStackTrace();
        }
    }

    /*
    readQuestions() returns Question Object
    toTest() needs Question


    readQuestions()
        .toTest();
     */
}
