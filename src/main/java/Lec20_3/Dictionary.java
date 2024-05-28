package Lec20_3;

import java.util.*;

public class Dictionary {
    Map<String, List<String>> dic = new HashMap<>();


    public void addToDic (String english, String german){
        if(dic.containsKey(english)){
            dic.get(english).add(german);
        }else{
            ArrayList<String> as = new ArrayList<>();
            as.add(german);
            dic.put(english, as);
        }
    }

    public void addToDic(String english, List<String> german){
        if(dic.containsKey(english)){
            for(String s : german){
                if(!(dic.get(english).contains(s))){
                    dic.get(english).add(s);
                }
            }
        }else{
            dic.put(english, german);
        }
    }

    public List<String> getTranslations(String english){
        return(dic.get(english));
    }

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.addToDic("to clean", "reinigen");
        d.addToDic("to clean", "säubern");
        d.addToDic("to clean", "putzen");
        List<String> expandGerman = new ArrayList<>();
        expandGerman.add("vergrößern");
        expandGerman.add("wachsen");
        d.addToDic("to expand", expandGerman);
        d.addToDic("to expand", "erweitern");

        List<String> TranslateClean = d.getTranslations("to clean");
        for(String s : TranslateClean){
            System.out.println(s);
        }
        System.out.println();
        List<String> translateExpand = d.getTranslations("to expand");
        for(String s : translateExpand){
            System.out.println(s);
        }

    }
}
