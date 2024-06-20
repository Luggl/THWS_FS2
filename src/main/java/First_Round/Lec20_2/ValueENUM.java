package First_Round.Lec20_2;

public enum ValueENUM {

    BUBE(14, "Bube"), ZEHN(13, "10"),  ASS(12, "Ass"),
    KOENIG(11, "König"), DAME(10, "Dame"), NEUN(9, "Neun"),
    ACHT(8, "Acht"), SIEBEN(7, "Sieben"), SECHS(6, "Sechs"),
    FUENF(5, "Fünf"), Vier(4, "Vier"), DREI(3, "Drei"), ZWEI(2, "Zwei");

    private int val;
    private String name;



    ValueENUM(int val, String name){
        this.val = val;
        this.name = name;
    }

    int getVal(){
        return(this.val);
    }

    String getName(){
        return(this.name);
    }
}
