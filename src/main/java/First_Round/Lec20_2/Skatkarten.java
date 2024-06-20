package First_Round.Lec20_2;

public class Skatkarten implements Comparable<Skatkarten>  {
    ColorENUM color;
    ValueENUM value;



    public Skatkarten(ColorENUM color, ValueENUM value){
        this.color = color;
        this.value = value;
    }

    public int getColorVal(){
        return(color.getVal());
    }

    public int getValueVal(){
        return(value.getVal());
    }

    public int compareTo(Skatkarten c) {
        if (this.value.getVal() == 14) {
            if (!(c.value.getVal() == 14)){
                return -1;
            } else {
                if (color.getVal() < c.getValueVal()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        if (this.getColorVal() < c.getColorVal()) {
            return 1;
        }
        if (this.getColorVal() > c.getColorVal()) {
            return -1;
        } else {
            if (this.getValueVal() < c.getValueVal()) {
                return 1;
            } else if(this.getValueVal() > c.getValueVal()) {
                return -1;
            }
        }
        return(0);
    }
    @Override
    public String toString(){
        return(this.color.getName() + "\t" + this.value.getName() + "\n");
    }
}
