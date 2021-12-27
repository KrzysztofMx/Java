package com.company;

public class Wlasciciel {
    String Imie;
    String Nazwisko;
    String Adres;

    public Wlasciciel(String I, String N, String A){
        Imie = I;
        Nazwisko = N;
        Adres = A;
    }
    public void getWlas(){
        System.out.println("Imie :" + Imie + ", Nazwisko :" + Nazwisko + ", Adres :"+ Adres );
    }
}
