//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] liczby = {1,2,3,
                        2,3,4,
                        3,4,2};
        ObliczeniaNaTablicy ob1 = new ObliczeniaNaTablicy(liczby);
        ObliczeniaNaTablicy ob2 = new ObliczeniaNaTablicy(20, 0, 5);

        System.out.println("OB1");
        System.out.println(ob1);
        System.out.println(ob1.zwrocSrednia());
        System.out.println(ob1.zwrocSume());


        System.out.println("OB2");
        System.out.println(ob2);
        System.out.println(ob2.zwrocSrednia());
        System.out.println(ob2.zwrocSume());
        System.out.println(("\n"));

    }
}