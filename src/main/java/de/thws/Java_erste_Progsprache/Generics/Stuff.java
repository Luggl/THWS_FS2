package de.thws.Java_erste_Progsprache.Generics;

import de.thws.Java_erste_Progsprache.Streams.EinmalEins;

public class Stuff {
    String s;


    public <T> Stuff(String s, T parameter){
        System.out.println(s);
        System.out.println(parameter);
    }

    public static void main(String[] args) {
        EinmalEins e = new EinmalEins(10);
        e.init();
        Stuff stuff = new Stuff("Hello world", e);
    }
}
