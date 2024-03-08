import java.util.Arrays;
import java.util.Random;
public class ObliczeniaNaTablicy {

    private  int[] tablica;

    public ObliczeniaNaTablicy( int[] tablica){
        this.tablica = tablica;
    }
    public  ObliczeniaNaTablicy(int rozmiar, int a, int b){
        this.tablica = generujTablice(rozmiar, a, b);
    }

    private int[] generujTablice(int rozmiar, int a, int b){
        Random rand = new Random();
        int[] temp = new int[rozmiar];
        for( int i = 0; i < rozmiar; i++){
            temp[i] = rand.nextInt(a,b+1);
        }
        return temp;
    }

    public double zwrocSrednia(){
        return (double)zwrocSume() / Arrays.stream(tablica).count();
    }

    public int zwrocSume() {
        return Arrays.stream(tablica).sum();
    }

    @Override
    public String toString(){
        String[] temp = Arrays.stream(tablica).mapToObj(String::valueOf).toArray(String[]::new);
        return String.join(", ", temp);
    }
}
