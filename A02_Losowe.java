package pl.edu.zse;
import java.util.Random; //importujemy framework

//napisz program losujący numery rzutu kostką (wskazówka ,możesz urzyć framework  java.util)

public class A02_Losowe {
    public static void main(String[] args){

        // Deklarujemy zmienną los typu Random [Random los] i tworzymy nowy obiekt [new Random()]
        Random los = new Random();

        int najwieksza = 6; // tworzymy zmienną najwieksza

        int losowa = los.nextInt(najwieksza + 1);
        //tworzymy zmienną losowa i przypisujemy do niej metodę [nextInt()]
        // określając maksymalną wartość pamiętamy że indeksowanie zaczyna się od 0

        System.out.println("randomowa liczba int od 1 do " + najwieksza + " to: "+ losowa);
    }
}
