package Second_Round.Lec15_2;

public class Professor extends Person{
    String taetigkeit;

    public Professor(String taetigkeit){
        this.taetigkeit = taetigkeit;
    }

    public void gibTaetigkeitAus(){
        System.out.println("Der Professor unterrichtet "+ this.taetigkeit + ".");
    }
}
