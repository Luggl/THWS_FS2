package Second_Round.Lec20_2;

public enum Value {
    SIEBEN(7), ACHT(8), NEUN(9), DAME(10), KOENIG(11), ZEHN(10), ASS(11), BUBE(12);

    private final int val;
    public int getVal(){
        return(this.val);
    }

    Value(int val){
        this.val = val;
    }
}
