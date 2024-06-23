package Second_Round.Lec16_4;

public class Mensch {

    public void essen(){}
    public void schlafen(){}
    public void arbeiten(){}
    public void autofahren(){}

    public Reaktion entscheide(Gefahren gefahr){

        int prob = (int) (Math.random() * 100);
        if(prob <=75){
            return(gefahr.getreaction());
        }else{
            return(Reaktion.UNENTSCHIEDEN);
        }

    }

    public static void main(String[] args) {
        Mensch m = new Mensch();
        System.out.println(m.entscheide(Gefahren.GEFAHR_VORNE));
    }
}
