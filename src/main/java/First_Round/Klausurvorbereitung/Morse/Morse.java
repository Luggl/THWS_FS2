package First_Round.Klausurvorbereitung.Morse;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    Map<String, String> map;
    public static String charToMorseCode(char c) {

        String morseCode = switch (c) {
            case 'A' -> ".-";
            case 'B' -> "−...";
            case 'C' -> "−.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "_._";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            default ->
                    throw new RuntimeException("Unexpected value: "+c);
        };
        return morseCode;
    }

    public Map<String, String> getMorseCodeMap(){
        Map<String, String> out = new HashMap<>();
        for(int i = (int) 'A'; i<= (int) 'Z'; i++){
            out.put(String.valueOf((char) i), charToMorseCode((char) i));
        }
        return(out);
    }

    public Morse(){
        this.map = getMorseCodeMap();
    }

    public String zeichenketteToMorse(String s){
        String out = "";
        for(char c : s.toCharArray()){
            out = out + charToMorseCode(Character.toUpperCase(c)) + " ";
        }
        return(out);
    }

    public static void main(String[] args) {
        Morse morse = new Morse();
        System.out.println(morse.zeichenketteToMorse("Purzelbaum"));
    }
}
