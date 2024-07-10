package Klausur2020SS.Zufallsverwaltung;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class Zufallsverwaltung {
    Deque<Double> returnedNumbers = new ArrayDeque<>();

    public double next(Optional<Double> in){
        if(in.isPresent()){
            returnedNumbers.push(in.get());
            return(in.get());
        }else{
            double d = Math.random();
            returnedNumbers.push(d);
            return d;
        }
    }

    public Optional<Double> undo(){
        if(returnedNumbers.isEmpty()){
            throw new RuntimeException("undo nicht möglich");
        }else{
            return(Optional.of(returnedNumbers.pop()));
        }
    }

    public static void main(String[] args) {
        Zufallsverwaltung z = new Zufallsverwaltung();
        System.out.println(z.next(Optional.empty()));
        System.out.println(z.next(z.undo()));
    }
}
