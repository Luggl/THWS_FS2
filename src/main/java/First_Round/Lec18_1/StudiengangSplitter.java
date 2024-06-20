package First_Round.Lec18_1;

import java.io.*;

public class StudiengangSplitter {
    //a) --> bufferedReader

    public static void splitStudiengaenge(String dateiname) throws MatrikelNummerException{
        try(BufferedReader br = new BufferedReader(new FileReader(dateiname));
            BufferedWriter bwInf = new BufferedWriter(new FileWriter("InfNr.txt"));
            BufferedWriter bwWInf = new BufferedWriter(new FileWriter("WInfNr.txt"));
            BufferedWriter bwEC = new BufferedWriter(new FileWriter("ECNr.txt"))){
            do{
                String line = br.readLine();
                if(line == null) break;
                String identifier = line.substring(0, 2);
                try{
                    if(identifier.equals("51")){
                        bwInf.write(line);
                        bwInf.newLine();
                    }else if(identifier.equals("50")){
                        bwWInf.write(line);
                        bwWInf.newLine();
                    }else if(identifier.equals("61")) {
                        bwEC.write(line);
                        bwEC.newLine();
                    }else{
                        throw new MatrikelNummerException("Could not identify Matrikelnummer");
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }

            }while(true);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
