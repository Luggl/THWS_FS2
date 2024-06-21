package Second_Round.Lec16_2;

public class BetterChangeCalculator implements ChangeCalculator{
    public int[] getChange(int euros, int cent)
    {
        int cents = euros * 100 + cent;
        int[] out = new int[8];
        Coin[] coins = Coin.values();

        for(int i = 7; i>=0; i--){
            out[i] = cents / coins[i].value;
            cents = cents - out[i] * coins[i].value;
        }
        return(out);
    }
}
