package Lec14;

public class Ueb1 {
    public static double berechneKugelvolumen(double radius){
        if(radius < 0){
            throw new RuntimeException("Ungültiges Argument");
        }else{
            return 4/3*Math.PI*radius*radius*radius;
        }

    }
}
