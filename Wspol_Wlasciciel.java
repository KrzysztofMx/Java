package com.company;

public class Wspol_Wlasciciel {
    String Imie2;
    String Nazwisko2;
    String Adres2;

    public Wspol_Wlasciciel(String I, String N, String A){
        Imie2 = I;
        Nazwisko2 = N;
        Adres2 = A;
    }
    public void getWlas2(){

        System.out.println("Imie :" + Imie2 + ", Nazwisko :" + Nazwisko2 + ", Adres :"+ Adres2 );
    }
}
