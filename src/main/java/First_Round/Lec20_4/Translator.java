package First_Round.Lec20_4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<Character, Integer> keyboard = new HashMap<>();

    public void initMap(){
        int count = 3;
        int number = 2;
        for(int i = 65; i<=90; i++){
            if(i<83) {
                if (count > 0) {
                    keyboard.put((char) i, number);
                    count--;
                } else {
                    number++;
                    count = 3;
                    keyboard.put((char) i, number);
                }
            }else{
                if(i == 83){
                        keyboard.put((char) i , 7);
                }else if(i < 87){
                    keyboard.put((char) i , 8);
                }else{
                    keyboard.put((char) i , 9);
                }
            }
        }
    }

    public int getNumber(char c) throws IllegalTelephoneNumberException{
        try{
            return(keyboard.get(c));
        }catch(Exception e){
            throw new IllegalTelephoneNumberException("Illegal Character!");
        }
    }

    public void doYourThing(){
        try(BufferedReader br = new BufferedReader(new FileReader("Zeichenkontakte.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Nummernkontakte.txt"));){

            do {
                try {
                    char[] read = br.readLine().toCharArray();
                    StringBuilder out = new StringBuilder();
                    for (char c : read) {
                        try {
                            out.append(getNumber(c));
                        } catch (IllegalTelephoneNumberException e) {
                            System.out.println(c + "is not valid to tranlate!");
                        }
                    }
                    bw.write(out.toString());
                    bw.newLine();
                    bw.flush();
                } catch (Exception e) {
                    System.out.println("Nothing else to read");
                    break;
                }
            }while(true);


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Translator t = new Translator();
        t.initMap();
        t.doYourThing();
    }


}
