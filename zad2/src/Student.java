public class Student {
    public String Imie;
    public  String Nazwisko;
    public int NrAlbumu;

    public Student( String Imie, String Nazwisko, int NrAlbumu){
        this.Imie = Imie;
        this. Nazwisko = Nazwisko;
        this.NrAlbumu = NrAlbumu;
    }

    @Override
    public String toString(){
        return  String.format("Student: %s %s\nNr Albumu: %s", Imie, Nazwisko, NrAlbumu);
    }
}
