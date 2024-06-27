package Second_Round.Lec22_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class PrimzahlThread extends Thread{
    int zahlZumTesten;
    int[] zahlenZumTesten;
    Map<Integer, Boolean> ergebnis = new LinkedHashMap<>();

    public PrimzahlThread(int zahlZumTesten){
        this.zahlZumTesten = zahlZumTesten;
    }

    public PrimzahlThread(int[] zahlenZumTesten){
        this.zahlenZumTesten = zahlenZumTesten;
    }
    public boolean testeObPrimzahl(int zahl){
        if (zahl < 2) return false;
        for (int divisor = 2; divisor < zahl; divisor++)
            if (zahl % divisor == 0) return false;
        return true;
    }
    @Override
    public void run(){
        for(Integer i : zahlenZumTesten){
            boolean isPrime = testeObPrimzahl(i);
            this.ergebnis.put(i, isPrime);
        }

    }

    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        for(int i = 0; i<5000; i++){
            int number = (int)(Math.random() * 500014 + 2);
            numbers.add(number);
        }
        int[] i1 = new int[500];
        int[] i2 = new int[500];
        int[] i3 = new int[500];

        for(int i = 0; i<500; i++){
            i1[i] = numbers.removeFirst();
            i2[i] = numbers.removeFirst();
            i3[i] = numbers.removeFirst();
        }

        PrimzahlThread p1 = new PrimzahlThread(i1);
        PrimzahlThread p2 = new PrimzahlThread(i2);
        PrimzahlThread p3 = new PrimzahlThread(i3);

        p1.start();
        p2.start();
        p3.start();

        try{
            p1.join();
            p2.join();
            p3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        Map<Integer, Boolean> ergebnisse = new TreeMap<>();
        ergebnisse.putAll(p1.ergebnis);
        ergebnisse.putAll(p2.ergebnis);
        ergebnisse.putAll(p3.ergebnis);

        for(Integer i : ergebnisse.keySet()){
            System.out.println(i + "\t->\t" + ergebnisse.get(i));
        }
    }
}
