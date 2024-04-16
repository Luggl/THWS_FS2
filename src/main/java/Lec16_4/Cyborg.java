package Lec16_4;

public class Cyborg implements IMensch, IRobot{
    Mensch m = new Mensch();
    Robot r = new Robot();

    public void essen(){}
    public void aufladen(){}
    public void schlafen(){}
    public void warten(){}
    public void arbeiten(){}
    public void autoFahren(){}
    public Reaktion entscheide(Gefahren g){
        Reaktion rM = m.entscheide(g);
        Reaktion rR = r.entscheide(g);
        if(rM == rR){
            System.out.println("Die Entscheidung ist eindeutig gefallen");
            return(rM);

        }else{
            System.out.println("Entscheidung nicht Eindeutig - der Zufall entscheidet");
            if(Math.random() > 0.5){
                return(rR);
            }else{
                return(rM);
            }
        }

    }

}
