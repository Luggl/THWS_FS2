package w3resource.Array;

public class Raum {
    Tür[] türen = new Tür[3];

    public Raum(){
        this.türen[0] = new Tür();
        this.türen[1] = new Tür();
        this.türen[2] = new Tür();
    }

    public static void main(String[] args) {
        System.out.println(Tür.gesamtcount);
    }
}
