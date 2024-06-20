package First_Round.Lec20_2;

public enum ColorENUM {
    KREUZ (4, "Kreuz"), PIK(3, "Pik"), HERZ(2, "Herz"), KARO(1, "Karo");

    private int val;
    private String name;


    ColorENUM(int val, String name){
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
