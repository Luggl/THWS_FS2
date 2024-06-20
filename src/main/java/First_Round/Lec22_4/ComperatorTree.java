package First_Round.Lec22_4;

import java.util.Comparator;

public class ComperatorTree implements Comparator<String> {

    @Override
    public int compare(String a, String b){
        if(a.length() < b.length()){
            return(-1);
        }else if(a.length() > b.length()){
            return(1);
        }else{
            return(a.compareTo(b));
        }
    }

}
