package Klausur2020SS_2.Aufgabe3;

public class Person {
    String name;
    int alter;

    public Person(String name, int alter){
        this.name = name;
        this.alter = alter;
    }


    public String toString(){
        String out = "Dieser Mensch heißt " + name + " und ist " + alter + " Jahre alt";
        return(out);
    }

    Object o;

    public static void main(String[] args) {
        Person vy = new Person("vy", 22);
        System.out.println(vy);
    }

}
