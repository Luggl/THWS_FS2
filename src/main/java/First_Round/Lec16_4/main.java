package First_Round.Lec16_4;

public class main {
    public static void main(String[] args) {
        Mensch m = new Mensch();
        Robot r = new Robot();
        Cyborg c = new Cyborg();

        System.out.println("Mensch: " + m.entscheide(Gefahren.GEFAHR_RECHTS).name());
        System.out.println("Robot: " + r.entscheide(Gefahren.GEFAHR_RECHTS).name());
        System.out.println("Cyborg: " + c.entscheide(Gefahren.GEFAHR_RECHTS).name());
        System.out.println("\n\n");
        System.out.println("Mensch: " + m.entscheide(Gefahren.GEFAHR_LINKS).name());
        System.out.println("Robot: " + r.entscheide(Gefahren.GEFAHR_LINKS).name());
        System.out.println("Cycborg: " + c.entscheide(Gefahren.GEFAHR_LINKS).name());
        System.out.println("\n\n");
        System.out.println("Mensch: " + m.entscheide(Gefahren.GEFAHR_VORNE).name());
        System.out.println("Robot: " + r.entscheide(Gefahren.GEFAHR_VORNE).name());
        System.out.println("Cyborg: " + c.entscheide(Gefahren.GEFAHR_VORNE).name());

    }
}
