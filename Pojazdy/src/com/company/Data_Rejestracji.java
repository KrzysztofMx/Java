package com.company;

import java.util.Date;

public class Data_Rejestracji {
    int r;
    int m;
    int d;

    public Data_Rejestracji(int rok, int mies, int dzien){
        r = rok;
        m = mies;
        d = dzien;
    }
    public void getInfo() {
        System.out.println("Data Rejestracji -> Rok: " + r + " Miesiąc: " + m + " Dzień: " + d);

    }

}
