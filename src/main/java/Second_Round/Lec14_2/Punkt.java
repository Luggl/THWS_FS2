package Second_Round.Lec14_2;

public class Punkt {
    int x;
    int y;
    public void verschiebePunkt(int zielX, int zielY) {
        if(zielX <0 || zielY < 0){
            throw new RuntimeException("Negative!");
        }else if(zielX > 1920){
            throw new RuntimeException("X Bigger than 1920");
        }else if(zielY > 1080){
            throw new RuntimeException("Y Bigger than 1080");
        }else{
            x = zielX;
            y = zielY;
        }

    }
}
