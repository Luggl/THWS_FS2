package Lec15_2;

public abstract class Person {
    String taetigkeit;

    public Person(String taetigkeit){
        this.taetigkeit = taetigkeit;
    }
    public abstract String gibTaetigkeitAus();

}
