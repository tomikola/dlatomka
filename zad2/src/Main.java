//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Prowadzacy prowadzacy = new Prowadzacy("Anna", "Nowak", Stanowisko.ASYSTENT);
        Prowadzacy prowadzacy1 = new Prowadzacy("Teodor", "Krzyk", Stanowisko.PROFESOR);
        Student[] stud = new Student[10];
        for(int i = 0; i < 10; i++){
            stud[i] = new Student( String.format("Imie_%s", i),
                                   String.format("Nazwisko_%s",i),
                                   i);
        }
        BlockZajeciowy blok = new BlockZajeciowy("Programowanie Java", prowadzacy, stud);
        BlockZajeciowy blok1 = new BlockZajeciowy("Analiza Matematyczna", prowadzacy1, stud);

        Sala sala1 = new Sala(1, DzienTygodnia.Sroda);

        sala1.DodajZajeciaDoSali(blok,0);
        sala1.DodajZajeciaDoSali(blok1, 2);
        try{
            sala1.DodajZajeciaDoSali(blok1,0);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println(sala1.toString());
    }
}