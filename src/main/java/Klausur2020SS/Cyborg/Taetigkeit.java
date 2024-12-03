package Klausur2020SS.Cyborg;

public enum Taetigkeit {
    ESSEN(25), SCHLAFEN(12), ARBEITEN(31), AUTOFAHREN(51), SERVICE(12), AUFLADEN(10);

    public int value;

    Taetigkeit(int value){
        this.value = value;
    }
}
