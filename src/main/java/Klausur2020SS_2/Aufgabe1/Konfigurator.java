package Klausur2020SS_2.Aufgabe1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Konfigurator {

    static String file = "konfig.txt";

    public static List<String> liesKongurationsdatei() throws IOException {
        List<String> out = new ArrayList<>();
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)
        ){
            while(true){
                String line = br.readLine();
                if(line!= null){
                    out.add(line);
                }else{
                    break;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return(out);
    }

    public static Map<String, String> getMap(List<String> in){
        Map<String, String> out = new HashMap<>();
        for(String s : in){
            out.put(s.substring(0, s.indexOf('=')), s.substring(s.indexOf('=')+1, s.length()));
        }
        return(out);
    }

    public static void main(String[] args) {
        try{
            Map<String, String> gelesen = getMap(liesKongurationsdatei());
            for(String s : gelesen.keySet()){
                System.out.println("key: " + s + "\t\tValue: " + gelesen.get(s));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
