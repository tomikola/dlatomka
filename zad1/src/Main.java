//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Zwierze kot = new Zwierze("Ala",15);
        Zwierze pies = new Zwierze("Yerba", 25, true);
        Zwierze papuga = new Zwierze("Captain Jack", 3);

        Zwierze[] zoo = {kot, pies, papuga};

        int waga = 0;
        int licznik = 0;
        for(Zwierze z: zoo){
            System.out.println(z);
            z.CzyMaNadwage();
            waga += z.Waga;
            licznik +=1;
        }
        float srednia_waga = waga/licznik;
        System.out.println((srednia_waga));

    }
}