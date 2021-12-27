package pl.edu.zse;

// Utwórz klasę Test z metodą main,
// w której towrzone będą zmienne typu Date
public class A01_Test {
    public static void main(String[] args) {

        //deklarujemy dwie zmienne typu Date (Start, End)

        A01_Date start = new A01_Date(2018, 9, 1); //tworzymy obiekt [new Date] z wartościami (2018 9 1)
        A01_Date end = new A01_Date(2022, 6, 1);   //tworzymy obiekt [new Date] z wartościami (2022 6 11)

// Wypisz wartości obiektów do których odnoszą się zmienne start i end
// (Wskazówka: możesz napisać dodatkową metodę (getInfo)
// zwracającą reprezentację tekstową obiektu typu Date )

        start.getInfo();//wypisujemy wartości obiektów
        end.getInfo();  //do których odnoszą sie zmienne typu start i end

//zadeklaruj zmienną typu Date o nazwie today i przypisz jej wartości zmiennej start
        A01_Date today = start;
        today.getInfo(); // wypisujemy wartość zmiennej today

//zmień wartość pól rok i dzień poprzez zmienną today na 2021 i 20
        today.r = 2021;//zmieniamy wartość pola r poprzez today na 2021
        today.d = 20;//zmieniamy wartość pola d poprzez today na 20

        today.getInfo();// wypisujemy wartość zmiennej today
        start.getInfo();// wypisujemy wartość zmiennej start

        end = today;
        end.getInfo();


    }
}
//przypisz wartości
//// Opcjonalnie możesz napisać program definiujący dodatkową metodę która
//// posłuży do wypisania nie tylko wartości daty
//// ale i nazwy zmiennej która ją wskazuje
//
//        //NIE DA SIĘ

