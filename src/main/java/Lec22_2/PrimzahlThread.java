package Lec22_2;

import java.util.HashMap;
import java.util.Map;

public class PrimzahlThread extends Thread{
    int[] checkInts;
    public Map<Integer , Boolean> m = new HashMap<>();


    public PrimzahlThread(int[] checkInts){
        this.checkInts = checkInts;
    }

    public boolean testeObPrimzahl(int zahlZumTesten) {
        if (zahlZumTesten < 2) return false;
        for (int divisor = 2; divisor < zahlZumTesten; divisor++)
            if (zahlZumTesten % divisor == 0) return false;
        return true;
    }

    @Override
    public void run(){
        for(int i : checkInts){
            m.put(i, testeObPrimzahl(i));
        }
    }
}
