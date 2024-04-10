package Lec15_3;

public abstract class Frage {
    protected String frage;

    public Frage(String frage){
        this.frage = frage;
    }

    public void setFrage(String frage){
        this.frage = frage;
    }

    public String getFrage(){
        return(frage);
    }
}
