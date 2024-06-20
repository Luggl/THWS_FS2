package Second_Round.Lec14_4;

public class Strecke {
    int a;
    int b;

    public Strecke(int a, int b){
        if(a > b){
            this.a = b;
            this.b = a;
        }else{
            this.a = a;
            this.b = b;
        }
    }

    public boolean overlap(Strecke o1, Strecke o2){
        boolean out = false;
        if(o1.a < o2.a && o1.b > o2.a || o1.a > o2.a && o1.a < o2.b){
            out = true;
        }
        return(out);
    }

    @Override
    public String toString(){

        if(this.a == this.b){
            return(String.valueOf(this.a));
        }else {
            String out = String.valueOf(this.a);
            for (int i = 0; i < (this.b - this.a); i++) {
                out += "-";
            }
            out += String.valueOf(this.b);

            return (out);
        }
    }

    public static void main(String[] args) {
        Strecke a = new Strecke(3, 5);
        System.out.println(a);
    }
}
