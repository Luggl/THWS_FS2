package Lec14;

public class A1Kugelvolumen {
    public static double berechneKugelvolumen(double radius){
        if(radius < 0){
            throw new RuntimeException("Ungültiges Argument");
        }else{
            return 4/3*Math.PI*radius*radius*radius;
        }

    }
}
