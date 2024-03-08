import javax.management.ValueExp;

public class Sala {
    public int NumberKlasy;
    public DzienTygodnia Dzien;
    public BlockZajeciowy[] Zajecia;

    public Sala(int NumperKlasy, DzienTygodnia Dzien){
        this.NumberKlasy = NumperKlasy;
        this.Dzien = Dzien;
        this.Zajecia = new BlockZajeciowy[8];
    }

    public void DodajZajeciaDoSali(BlockZajeciowy Block, int NumerZajec){
        if(NumerZajec < 8){
            if(Zajecia[NumerZajec] == null){
                Zajecia[NumerZajec] = Block;
            }
            else
                throw new IllegalArgumentException("Blok Godzinny jest zajęty");
        }
        else
            throw  new IllegalArgumentException("Wybrany Blok czasowy musi byc miedzy 0 a 7");
    }

    @Override
    public String toString(){
        String temp =String.format("Sala nr: %s\nDzień tygodnia: %s\n", NumberKlasy, Dzien);
        for(int i = 0; i < Zajecia.length; i++) {
            if (Zajecia[i] != null)
                temp += String.format("%s: %s Prowadzący: %s %s\n", i, Zajecia[i].NazwaPrzedmiotu,
                        Zajecia[i].ProwadzacyZajecia.imie, Zajecia[i].ProwadzacyZajecia.nazwisko);
            else
                temp += String.format("%s: Puste\n", i);
        }
        return temp;
    }

}
