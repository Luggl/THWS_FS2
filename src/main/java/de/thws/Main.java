package de.thws;

import Klausur2020SS.Aufgabe3.Knoten;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main<E> {
    public List<E> flatten(List<List<E>> lists){
        List<E> out = new ArrayList<>();
        for(List<E> l : lists){
            out.addAll(l);
        }

        return(out);
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("asdlfkj");
        a.add("adsjf");
        a.add("laueitjl");a.add("vübiprg");
        List<String> b = new ArrayList<>();
        b.add("a-jdfgöjahrt");
        b.add("akjfdört");
        b.add("sFjiäjsf");

        List<List<String>> lists = new ArrayList<>();
        lists.add(a);
        lists.add(b);
        Main<String> ma = new Main<>();
        List<String> n = ma.flatten(lists);
        for(String s : n){
            System.out.println(s);
        }


    }
}