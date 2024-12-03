package First_Round.Klausurvorbereitung.Fahrzeuge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.*;

public class FarbenMain {
    public static void main(String[] args) {
        Farben[] farben = Farben.values();
        List<Farben> fList = stream(farben).toList();
        ArrayList<Farben> farbenList = new ArrayList<>(fList);

        farbenList.stream()
                .sorted(new Comparator<Farben>(){
                    @Override
                    public int compare(Farben f1, Farben f2){
                        return(Integer.compare(f2.value, f1.value));
                    }
                })
                .forEach(f -> System.out.println(f));
    }
}
