package Second_Round.Lec20_2;

public enum Color {

    KARO(1), HERZ(2), PIK(3), KREUZ(4);

    private final int val;
    Color(int val){
        this.val = val;
    }
    public int getVal(){
        return(this.val);
    }

}
