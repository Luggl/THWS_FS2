package Lec14;

public class Ueb2 {
    int x;
    int y;
    public void verschiebePunkt(int zielX, int zielY) {
        if (zielY < 0 || zielX < 0) {
            throw new RuntimeException("Negativer Wert!");
        } else if (zielY > 1080) {
            throw new RuntimeException("Y greater than 1080!");
        }else if(zielX > 1920){
            throw new RuntimeException("X greater than 1920!");
        }else {
            x = zielX;
            y = zielY;
        }
    }
}
