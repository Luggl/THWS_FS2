package First_Round.Lec14;

public class A4Strecke {
    int a;
    int b;

    public A4Strecke(int a, int b){
        if(a <=0 || b<=0){
            throw new RuntimeException("negativ!");
        }else if(b<a){
            this.a = b;
            this.b = a;
        }else{
            this.a = a;
            this.b = b;
        }
    }

    public static boolean Ueberschneidung(A4Strecke first, A4Strecke second){
        boolean out = false;
        if(first.a < second.a && first.b > second.a ||
                first.a > second.a && first.a < second.b){
            out = true;
        }
        return(out);
    }

    @Override
    public String toString(){
        String out = "";
        out+= a;
        if(b>a) {
            for (int i = b; i > a; i--) {
                out += "-";
            }
            out += b;
        }
    return(out);
    }
}
