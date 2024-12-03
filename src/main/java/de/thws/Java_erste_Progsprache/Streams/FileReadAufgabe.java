package de.thws.Java_erste_Progsprache.Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class FileReadAufgabe {
    /*
    * Schreiben Sie eine Java-Anwendung, die eine Text-Datei mit Hilfe der Klasse
FileReader einliest und auf dem Bildschirm ausgibt. Der Name der auszugebenden
Datei, soll als Parameter an die Anwendung übergeben werden. Kann
die Datei nicht geöffnet bzw. gelesen werden, so soll eine Fehlermeldung ausgegeben
werden.*/
    static String file = "C:\\Users\\llang\\Documents\\DB Rotti\\CDVerwaltung\\README_DO_NOT_TOUCH_FILES.txt";
    private static ArrayList<String> readThisFile(){
        ArrayList<String> out = new ArrayList<>();
        try(FileReader fr = new FileReader(file);
        ){
            String s = "";
            do{
                int b = fr.read();
                if(b == -1){
                    out.add(s);
                    break;
                }
                if(b == '\n'){
                    out.add(s);
                    s = "";
                }else{
                    s += (char) b;
                }
            }while(true);

        }catch(Exception e){
            e.printStackTrace();
        }

        return(out);
    }

    public static void main(String[] args) {
        ArrayList<String> lines = readThisFile();
        while(!lines.isEmpty()){
            System.out.println(lines.removeLast());
        }
    }
}
