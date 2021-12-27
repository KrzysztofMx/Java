package com.company;

public class Samochod {
    Naped Naped_Sam;
    Dane_Podstawowe Dane;

    public Samochod(Naped naped, Dane_Podstawowe dane){
        Naped_Sam = naped;
        Dane = dane;
    }
    public void getSamo( ){
        Naped_Sam.getNaped();
        Dane.getDanePods();
    }
}

