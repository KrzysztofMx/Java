package pl.edu.zse;

//Utwórz klasę reprezentującą datę, która będzie pozwalała na przechowywanie
//dowolnych dat oraz na wypisywanie ich na konsoli i
//utwórz konstuktor w tej klasie

import java.sql.SQLOutput;

public class A01_Date { // Tworzymy klasę Date
    int r;
    int m;          //Przechowującą wartości typu int
    int d;

    public A01_Date(int rok, int mies, int dzien) { // Tworzymy konstruktor pobierający trzy argumenty typu int
        r = rok;
        m = mies;                              //Przypisujemy wartości argumentów konstruktora do wartości klasy
        d = dzien;
    }

    public void getInfo() {// Tworzymy metodę o nazwie getInfo zwracającą wartość tekstową obiektu Date
        System.out.println("Rok: " + r + " Miesiąc: " + m + " Dzień: " + d);
        System.out.println("A01_Date.getInfo");
    }

}


