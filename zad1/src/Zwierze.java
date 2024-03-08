public class Zwierze {
    String Imie;
    int Waga;
    boolean Udomowione;




    public Zwierze(String imie, int waga, boolean udomowione) {
        this.Imie = imie;
        this.Waga = waga;
        this.Udomowione = udomowione;
    }

    public Zwierze( String imie, int  waga){
        this(imie, waga, false);
    }

    public String PrintDetails() {
        // Drukuje szczegóły zwierzęcia
        return  String.format("Zwierze ma na imię %s, waży %d kg i ma status udomowienia %s", Imie, Waga, Udomowione);
    }

    public void CzyMaNadwage(){
        if(Waga > 20)
            System.out.println(String.format("%s ma nadwagę", Imie));
        else
            System.out.println(String.format("%s ma poprawną wagę", Imie));
    }

    @Override
    public String toString(){
        return String.format("Imie %s, Waga %s, czy udomowiony: %s", Imie, Waga, Udomowione);
    }
}
