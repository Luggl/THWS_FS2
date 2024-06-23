package Second_Round.Lec16_4;

public class Roboter {
    public void aufladen(){}
    public void warten(){}
    public void arbeiten(){}
    public void autofahren(){}
    public Reaktion entscheide(Gefahren gefahr){
        return(gefahr.getreaction());
    }

    public static void main(String[] args) {
        Roboter r = new Roboter();
        System.out.println(r.entscheide(Gefahren.GEFAHR_RECHTS));
    }

}
