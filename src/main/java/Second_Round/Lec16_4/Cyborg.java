package Second_Round.Lec16_4;

public class Cyborg {
    Mensch m;
    Roboter r;

    public Cyborg(){
        this.m = new Mensch();
        this.r = new Roboter();
    }

    public void essen(){}
    public void schlafen(){}
    public void arbeiten(){}
    public void autofahren(){}
    public void aufladen(){}
    public void warten(){}



    public Reaktion entscheide(Gefahren gefahr){
        Reaktion reaktionMensch = m.entscheide(gefahr);
        Reaktion reaktionRobot = r.entscheide(gefahr);

        if(reaktionRobot==reaktionMensch){
            return(reaktionMensch);
        }else{
            int count = (int)(Math.random() * 100);
            if(count<=50){
                return(reaktionMensch);
            }else{
                return(reaktionRobot);
            }
        }

    }

    public static void main(String[] args) {
        Cyborg c = new Cyborg();
    }
}
