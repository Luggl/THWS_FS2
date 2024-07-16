package Klausur2020SS_2.Vigenere;

import java.io.*;
import java.util.ArrayList;

public class Vigenere implements Serializable {
    transient ArrayList<char[]> vigenere = new ArrayList<>();
    char[] keyword = new char[26];
    transient char[] alph = new char[26];

    private void init(){
        for(int i = 0; i<alph.length; i++){
            alph[i] = (char)('A' + i);
        }
        for(int i = 0; i<alph.length; i++){
            char[] in = alph.clone();
            vigenere.add(in);
            shift();

        }
    }
    private void shift(){
        for(int i = 0; i<alph.length; i++){
            if(i == 25){
                alph[i] = (char) (alph[0] -1);
                break;
            }
            alph[i] = alph[i+1];
        }

    }

    public Vigenere(){
        keyword = "PANTOFFELPANTOFFELPANTOFFE".toCharArray();
        init();
    }
    public Vigenere(String in){
        init();
        if(in.length()>26){
            keyword = in.substring(0,26).toUpperCase().toCharArray();
        }else if (in.length() == 26){
            keyword = in.toUpperCase().toCharArray();
        }else{
            for(int i = 0; i< keyword.length; i++){
                keyword[i] = in.toUpperCase().charAt(i%in.length());
            }
        }
    }

    public void createSecretFile(){
        try(FileOutputStream fos = new FileOutputStream("geheimnis.oos");
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){
            oos.writeObject(this);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private char encryptChar(char in, int index){
        for(char[] c : vigenere){
            if(keyword[index] == c[index] && in >= 'A' && in <='Z'){
                return(c[in - 'A']);
            }
        }
        return(' ');
    }

    private char decryptChar(char in, int index){
        for(char[] c : vigenere) {
            if (keyword[index] == c[index]) {
                for (int i = 0; i < c.length; i++) {
                    if (c[i] == in) {
                        return (vigenere.get(0)[i]);
                    }
                }
            }
        }
        return(' ');

    }

    public String chiffre(String in){
        char[] inArray = in.toUpperCase().toCharArray();
        String out = "";
        for(int i = 0; i < inArray.length; i++){
            out += encryptChar(inArray[i], i);
        }
        return(out);
    }

    public String dechiffre(String in){
        char[] inArray = in.toUpperCase().toCharArray();
        String out = "";
        for(int i = 0; i < inArray.length; i++){
            out += decryptChar(inArray[i], i);
        }
        return(out);

    }

    public static void main(String[] args) {

        Vigenere v = new Vigenere();
        v.createSecretFile();

        try(FileInputStream fis = new FileInputStream("geheimnis.oos");
            ObjectInputStream ois = new ObjectInputStream(fis)
        ){
            Vigenere in = (Vigenere) ois.readObject();
            System.out.println(in.keyword);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
