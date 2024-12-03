package de.thws.Java_erste_Progsprache.Streams;

import java.io.FileWriter;

/*Schreiben Sie ein Programm, das die Zahlen des kleinen Einmaleins berechnet
und in der Textdatei einmaleins.txt ablegt. Die Zahlen sollen jeweils durch
einen Tabulator voneinander getrennt werden.
Die Textdatei einmaleins.txt sollte folgenden Inhalt haben:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100
b) Erweitern Sie das Programm so, dass die Größe der berechneten Tabelle durch
den Benutzer angegeben werden kann. Die Größe soll als Parameter beim Programmaufruf
übergeben werden, wie in folgendem Beispielaufruf:*/

public class EinmalEins {
    int[][] feld;
    public EinmalEins(int size){
        feld = new int[size][size];
    }
    public void init(){
        for(int i = 1; i <= feld.length; i++){
            for(int j = 1; j<=feld[i-1].length; j++){
                if(i == 1){
                    feld[i-1][j-1] = j;
                }else if(j == 1){
                    feld[i-1][j-1] = i;
                }else{
                    feld[i-1][j-1] = feld[i-1][0] * feld[0][j-1];
                }
            }

        }
    }

    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i<feld.length; i++){
            for(int j = 0; j<feld[i].length; j++){
                out += feld[i][j] + "\t";
            }
            out += "\n";
        }

        return(out);
    }

    public void writeToFile(String file){
        try(FileWriter fw = new FileWriter(file)){
            for(int i = 0; i<feld.length; i++){
                for(int j = 0; j<feld[i].length; j++){
                    fw.write(feld[i][j] + "\t");
                }
                fw.write("\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EinmalEins e = new EinmalEins(35);
        e.init();
        System.out.println(e);
        e.writeToFile("einmaleins.txt");
    }
}
