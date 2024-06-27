package Second_Round.Lec20_2;

public class Card implements Comparable<Card>{

    Color color;
    Value value;

    public Card(Color color, Value value){
        this.color = color;
        this.value = value;
    }

    public int compareTo(Card o){
        int deltVal = this.value.getVal() - o.value.getVal();
        int deltCol = this.color.getVal() - o.color.getVal();

        if(this.value.getVal() == 12){
            if(o.value.getVal() == 12){
                if(deltCol > 0){
                    return(1);
                }else{
                    return(-1);
                }
            }else{
                return(1);
            }
        }else{
            if(deltCol>0){
                return(1);
            }else if (deltCol<0){
                return(-1);
            }else{
                if(deltVal>0){
                    return(1);
                }else if(deltVal<0){
                    return(-1);
                }else{
                    return(0);
                }
            }
        }
    }

    @Override
    public String toString(){
        return(this.color + "\t" + this.value);
    }



}
