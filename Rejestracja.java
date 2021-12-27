package com.company;

public class Rejestracja{
    String nr_Rej ;
    Samochod auto;
    Wlasciciel Wlas;
    Wspol_Wlasciciel Wlas2;
    Data_Rejestracji DatRej;
    Data_wyrejestrowania DatWrej;

    public Rejestracja(String Rej, Samochod aut, Wlasciciel os1, Wspol_Wlasciciel os2, Data_Rejestracji d1, Data_wyrejestrowania d2){
        nr_Rej = Rej;
        auto = aut;
        Wlas = os1;
        Wlas2 = os2;
        DatRej = d1;
        DatWrej = d2;
    }

    void getRejestracja(){
        System.out.println(" ");
        System.out.println("________________AUTO_______________");
        System.out.println("Numer rejestracyjny samochod: "+nr_Rej);
        System.out.println(" ");
        System.out.println("______________Samochód_______________");
        auto.getSamo();
        System.out.println("_____________Właściciel1_____________");
        Wlas.getWlas();
        System.out.println("_____________Właściciel2_____________");
        Wlas2.getWlas2();
        System.out.println("___________Data Rejestracji__________");
        DatRej.getInfo();
        System.out.println("_________Data Wyrejestrowania________");
        DatWrej.getInfo2( );
        System.out.println("________________KONIEC_______________");
    }
}
