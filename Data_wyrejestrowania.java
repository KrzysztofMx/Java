package com.company;



public class Data_wyrejestrowania {
    int r;
    int m;
    int d;

    public Data_wyrejestrowania(int rok, int mies, int dzien){
        r = rok;
        m = mies;
        d = dzien;
    }
    public void getInfo2() {

        System.out.println("Data Wyrejestrowania -> Rok: " + r + " Miesiąc: " + m + " Dzień: " + d);

    }
}
