package First_Round.Lec16_2;

public class ChangeMain {
    public static void main(String[] args){
        SimpleChangeCalculator s = new SimpleChangeCalculator();
        int[] simple = s.getChange(3, 42);
        ExpertChangeCalculator e = new ExpertChangeCalculator();
        int[] expert = e.getChange(3, 42);

        Coin[] c = Coin.values();

        for(int i = 0; i<simple.length; i++){
            System.out.println(simple[i] + " ------- " + c[i].value);
        }

        for(int i = 0; i<expert.length; i++){
            System.out.println(expert[i] + " ------- " + c[i].value);
        }
    }
}
