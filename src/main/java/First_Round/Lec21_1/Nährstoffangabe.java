package First_Round.Lec21_1;

public class Nährstoffangabe {
    private int portionsgr;
    private int anzahlPortion;
    private int eiweiß;
    private int fett;
    private int kohlenhydrate;
    private int natrium;

    private Nährstoffangabe(int portionsgr, int anzahlPortion, int eiweiß, int fett, int kohlenhydrate, int natrium){
        this.portionsgr = portionsgr;
        this.anzahlPortion = anzahlPortion;
        this.eiweiß = eiweiß;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.natrium = natrium;
    }

    @Override
    public String toString(){
        return("Portionsgr: " +"\t\t" + this.portionsgr +"\n" +
                "Anzahl Portionen " +"\t" + this.anzahlPortion + "\n" +
                "Eiweiß: " + "\t\t\t" + this.eiweiß + "\n" +
                "Fett: " + "\t\t\t\t" + this.fett + "\n" +
                "Kohlenhydrate: " + "\t\t" + this.kohlenhydrate + "\n" +
                "Natrium: " + "\t\t\t" + this.natrium);
    }


    public static class NährstoffangabeBuilder{
        private int portionsgr;
        private int anzahlPortion;
        private int eiweiß;
        private int fett;
        private int kohlenhydrate;
        private int natrium;

        public NährstoffangabeBuilder(int portionsgr, int anzahlPortion){
            this.portionsgr = portionsgr;
            this.anzahlPortion = anzahlPortion;
        }

        public NährstoffangabeBuilder withEiweiß(int eiweiß){
            this.eiweiß = eiweiß;
            return this;
        }
        public NährstoffangabeBuilder withFett(int fett){
            this.fett = fett;
            return this;
        }
        public NährstoffangabeBuilder withKohlenhydrate(int kohlenhydrate){
            this.kohlenhydrate = kohlenhydrate;
            return this;
        }
        public NährstoffangabeBuilder withNatrium(int natrium){
            this.natrium = natrium;
            return this;
        }
        public Nährstoffangabe build(){
            return new Nährstoffangabe(portionsgr, anzahlPortion, eiweiß, fett, kohlenhydrate, natrium);
        }


    }

    public static void main(String[] args) {
        Nährstoffangabe n = new NährstoffangabeBuilder(200, 3)
                .withEiweiß(35)
                .withFett(15)
                .withKohlenhydrate(55)
                .withNatrium(19)
                .build();

        System.out.println(n);

    }


}
