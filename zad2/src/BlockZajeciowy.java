public class BlockZajeciowy {

    public String NazwaPrzedmiotu;
    public Prowadzacy ProwadzacyZajecia;

    public Student[] ListaStudentow;

    public BlockZajeciowy( String NazwaPrzedmiotu, Prowadzacy ProwadzacyZajecia, Student[] ListaStudentow){
        this.NazwaPrzedmiotu = NazwaPrzedmiotu;
        this.ProwadzacyZajecia = ProwadzacyZajecia;
        this.ListaStudentow = ListaStudentow;
    }

    @Override
    public String toString(){
        String temp = String.format("Przedmiot: %s\nProwadzący: %s %s\nIlość uczestników: %s\nLista studentów]\n", NazwaPrzedmiotu, ProwadzacyZajecia.imie,
                ProwadzacyZajecia.nazwisko, ListaStudentow.length);
        for(Student s : ListaStudentow){
            temp+=String.format("%s %S\n",s.Imie, s.Nazwisko);
        }

        return temp;
    }
}

