package Lec16_2;

public class ExpertChangeCalculator implements ChangeCalculator{
    @Override
    public int[] getChange(int euros, int cent) {
        int changeExpected = euros*100+cent;
        int changeSum = 0;
        int [] out = new int[8];

        while(changeSum<changeExpected){
            if(changeExpected-changeSum>=Coin.EURO_2.value){
                changeSum += Coin.EURO_2.value;
                out[Coin.EURO_2.ordinal()]++;
            }else if(changeExpected-changeSum>=Coin.EURO_1.value){
                changeSum += Coin.EURO_1.value;
                out[Coin.EURO_1.ordinal()]++;
            }else if(changeExpected-changeSum>=Coin.CENT_50.value){
                changeSum += Coin.CENT_50.value;
                out[Coin.CENT_50.ordinal()]++;
            }else if(changeExpected-changeSum>=Coin.CENT_20.value){
                changeSum += Coin.CENT_20.value;
                out[Coin.CENT_20.ordinal()]++;
            }else if(changeExpected-changeSum>=Coin.CENT_10.value){
                changeSum+=Coin.CENT_10.value;
                out[Coin.CENT_10.ordinal()]++;
            }else if(changeExpected-changeSum>=Coin.CENT_5.value){
                changeSum+=Coin.CENT_5.value;
                out[Coin.CENT_5.ordinal()]++;
            }else if(changeExpected-changeSum>=Coin.CENT_2.value){
                changeSum+=Coin.CENT_2.value;
                out[Coin.CENT_2.ordinal()]++;
            }else{
                changeSum+=Coin.CENT_1.value;
                out[Coin.CENT_1.ordinal()]++;
            }

        }
        return(out);
    }
}
