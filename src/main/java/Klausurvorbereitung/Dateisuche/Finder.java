package Klausurvorbereitung.Dateisuche;

import java.io.*;

public class Finder {
    public BufferedReader getSystemInAsBufferedReader() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return(br);
        }catch(Exception e){
            e.printStackTrace();
        }
        return(null);
    }
    public void findStringInFiles(String searchString,
                                  String[] filenames)   {

        for(String s : filenames){
            try(InputStream is = new FileInputStream(s);
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
            ){
                int zeilennummer = 0;
                while(true){
                    String read = br.readLine();
                    if(read == null) {
                        break;
                    }
                    zeilennummer++;
                    if(read.contains(searchString)){
                        System.out.println("Found in file: " + s + "\nZeile: " + zeilennummer);
                    }
                }

            }catch(FileNotFoundException e){
                System.out.println("File not found: " + s);
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args)
    {
        Finder finder = new Finder();
        BufferedReader br = finder.getSystemInAsBufferedReader();
        String searchString = null;
        String[] files = new String[]{"Finder1.txt", "Finder2.txt", "Finder3.txt", "Finder4.txt"};
        try {
            searchString = br.readLine();
            finder.findStringInFiles(searchString, files);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        };
    }
}
