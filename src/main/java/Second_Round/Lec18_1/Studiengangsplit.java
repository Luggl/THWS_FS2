package Second_Round.Lec18_1;

import java.io.*;
import java.util.Arrays;

public class Studiengangsplit {

    public void splitStudiengaenge(String dateiname) throws MatrikelnrExcept{
        try(FileInputStream fis = new FileInputStream(dateiname);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            BufferedWriter bwWinf = new BufferedWriter(new FileWriter("Winf.txt"));
            BufferedWriter bwInf = new BufferedWriter(new FileWriter("Inf.txt"));
            BufferedWriter bwEC = new BufferedWriter(new FileWriter("EC.txt"))
        ){

            do {
                try {
                    String s  = br.readLine();
                    if(s == null){
                        break;
                    }
                    if(s.length() == 7){
                        int y = Integer.parseInt(s);
                        if(y>=5000000 && y<= 5099999){
                            bwWinf.write(s);
                            bwWinf.newLine();
                            bwWinf.flush();
                        }else if(y>=5100000 && y <= 5199999){
                            bwInf.write(s);
                            bwInf.newLine();
                            bwInf.flush();
                        }else if(y>=6100000 && y<= 6199999){
                            bwEC.write(s);
                            bwEC.newLine();
                            bwEC.flush();
                        }else{
                            throw new MatrikelnrExcept("Wrong Matrikelnr." + s);
                        }
                    }else {
                        throw new MatrikelnrExcept("Not even close: " + s);
                    }
                } catch (IOException e) {
                    break;
                }
            }while(true);


        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Studiengangsplit s = new Studiengangsplit();
        try{
            s.splitStudiengaenge("Matrikelnummern.txt");
        }catch(MatrikelnrExcept m){
            System.out.println(m.getError());
        }
    }
}
