package First_Round.Lec16_4;

public class Mensch implements IMensch {
    public Reaktion entscheide(Gefahren g){
        if(Math.random()*4>3.0){
            return(Reaktion.UNENTSCHIEDEN);
        }else{
            return(g.r);
        }
    }
    public void essen(){}
    public void schlafen(){}
    public void arbeiten(){}
    public void autoFahren(){}
}
