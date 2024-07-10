package Second_Round.Lec21_1;

public class Nährstoffangabe {
    int portionsgr;
    int anzahl;
    int eiweiß;
    int fett;
    int kohlenhydrate;
    int natrium;


    private Nährstoffangabe(int portionsgr, int anzahl, int eiweiß, int fett, int kohlenhydrate, int natrium){
        this.portionsgr = portionsgr;
        this.anzahl = anzahl;
        this.eiweiß = eiweiß;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.natrium = natrium;
    }

    public static class NährstoffangabeBuilder{
        private int portionsgr;
        private int anzahl;
        private int eiweiß;
        private int fett;
        private int kohlenhydrate;
        private int natrium;

        public NährstoffangabeBuilder(int portionsgr, int anzahl){
            this.portionsgr = portionsgr;
            this.anzahl = anzahl;

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
            return(new Nährstoffangabe(this.portionsgr, this.anzahl, this.eiweiß, this.fett, this.kohlenhydrate, this.natrium));
        }

    }

    @Override
    public String toString(){
        String out =    "Portionsgr:\t" + this.portionsgr + "\n" +
                        "Anzahl:\t\t"+ this.anzahl + "\n" +
                        "Eiweiß:\t\t"+this.eiweiß + "\n" +
                        "Fett:\t\t"+this.fett+"\n" +
                        "Kohlenhydrate:\t" + this.kohlenhydrate + "\n" +
                        "Natrium:\t" + this.natrium;
        return(out);
    }

    public static void main(String[] args) {
        Nährstoffangabe n = new Nährstoffangabe.NährstoffangabeBuilder(2, 3)
                .withEiweiß(12)
                .withFett(14)
                .build();

        System.out.println(n);
    }


}
