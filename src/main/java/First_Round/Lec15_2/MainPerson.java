package First_Round.Lec15_2;

public class MainPerson {
    public static void main(String[] args){
        Person[] personen = new Person[100];
        for(int i = 0; i < personen.length; i++){
            if(i % 2 == 0){
                personen[i] = new Student("Programmieren");
            }else{
                personen[i] = new Professor("Programmieren");
            }
        }
        for(int i = 0; i< personen.length; i++){
            System.out.println(personen[i].gibTaetigkeitAus());
        }
    }


}
