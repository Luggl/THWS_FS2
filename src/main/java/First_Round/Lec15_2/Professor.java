package First_Round.Lec15_2;

public class Professor extends Person{

    public Professor(String taetigkeit){
        super(taetigkeit);
    }

    @Override
    public String gibTaetigkeitAus(){

        return("Der Professor unterrichtet " + this.taetigkeit + ".");
    }
}
