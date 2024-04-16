package Lec16_4;

public class main {
    public static void main(String[] args) {
        Mensch m = new Mensch();
        Robot r = new Robot();
        Cyborg c = new Cyborg();

        System.out.println(m.entscheide(Gefahren.GEFAHR_RECHTS).name());
        System.out.println(r.entscheide(Gefahren.GEFAHR_RECHTS).name());
        System.out.println(c.entscheide(Gefahren.GEFAHR_RECHTS).name());

    }
}
