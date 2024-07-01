package Klausur2020SS.Aufgabe1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Konfigurator {
    public static List<String> liesKongurationsdatei() throws IOException {
        List<String> out = new ArrayList<>();
        try(FileReader fr = new FileReader("konfig.txt");
            BufferedReader br = new BufferedReader(fr);
        ){
            while(true){
                String x = br.readLine();
                if(x == null){
                    break;
                }else{
                    out.add(x);
                }
            }

        }
        return(out);
    }

    public static Map<String, String> getMap(List<String> strings){
        Map<String, String> out = new HashMap<>();
        for(String s : strings){
            String k = s.substring(0, s.indexOf('='));
            String v = s.substring(s.indexOf('=')+1, s.length());
            out.put(k, v);

        }
        return(out);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        try{
            map = getMap(liesKongurationsdatei());
        }catch(IOException e){
            e.printStackTrace();
        }

        for(String k : map.keySet()){
            System.out.println(k + "\t\t" + map.get(k));
        }
    }
}
