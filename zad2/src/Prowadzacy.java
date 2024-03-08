public class Prowadzacy {

    public  String imie;
    public String nazwisko;
    public Stanowisko stanowisko;

    public Prowadzacy(String imie, String nazwisko, Stanowisko stanowisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString(){
        return String.format("Prowadzący: %s %s\nStanowisko: %s", imie, nazwisko, stanowisko);
    }

}
