package w3resource.Array;

public class Tür {
    int count;
    static int gesamtcount=0;

    public Tür(){
        count = 0;
    }

    public void betrete(){
        this.count++;
        gesamtcount++;
    }


    public static void main(String[] args) {
        Raum a = new Raum();
        a.türen[0].betrete();
        a.türen[1].betrete();
        a.türen[1].betrete();
        a.türen[2].betrete();
        for(int i = 0; i<250; i++){
            a.türen[(int)(Math.random() * 3)].betrete();
        }

        System.out.println(a.türen[0].count);
        System.out.println(a.türen[1].count);
        System.out.println(a.türen[2].count);
        System.out.println(gesamtcount);
    }
}
