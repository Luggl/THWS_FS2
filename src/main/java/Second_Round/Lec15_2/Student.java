package Second_Round.Lec15_2;

public class Student extends Person{
    String taetigkeit;
    public Student(String taetigkeit){
        this.taetigkeit = taetigkeit;
    }
    public void gibTaetigkeitAus(){
        System.out.println("Der Student besucht das Fach " + this.taetigkeit + ".");
    }
}
