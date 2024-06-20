package First_Round.Lec22_2;

import java.util.HashMap;
import java.util.Map;

public class PrimeMain {

    public static int[] getInts(){
        int[] integers = new int[250];
        for(int i = 0; i<250; i++){
            integers[i] = (int) ((Math.random() + 1) * 6859632);
        }
        return(integers);
    }

    public static void main(String[] args) {

        PrimzahlThread p1 = new PrimzahlThread(getInts());
        PrimzahlThread p2 = new PrimzahlThread(getInts());
        PrimzahlThread p3 = new PrimzahlThread(getInts());

        p1.start();
        p2.start();
        p3.start();

        try{
            p1.join();
            p2.join();
            p3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }



        Map<Integer, Boolean> m = new HashMap<>();
        m.putAll(p1.m);
        m.putAll(p2.m);
        m.putAll(p3.m);

        for(Integer i : m.keySet()){
            System.out.println(i + " -> " + m.get(i));
        }
    }
}
