package Second_Round.Lec14_1;

public class Kugelvolumen {
    public static double berechneKugelvolumen(double radius)
    {
        if(radius>0) {
            return 4 / 3d * Math.PI * radius * radius * radius;
        }else{
            return(0);
        }
    }

}
