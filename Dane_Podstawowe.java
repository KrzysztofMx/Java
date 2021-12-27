package com.company;

public class Dane_Podstawowe {
    String Nazwa_producenta,
            Nazwa_Modelu,
            Typ_Auta,
            Masa_calkowita,
            Rok_Produkcji,
            Numer_Vin,
            Kolor;
    Data_Rejestracji Data_Dane;

    public Dane_Podstawowe(String Nazwa_prod, String Nazwa_Mod,String T_Auta,String Masa_cal,String Rok_Prod,String Numer_V,String Kol,Data_Rejestracji dane){
        Nazwa_producenta = Nazwa_prod;
        Nazwa_Modelu = Nazwa_Mod;
        Typ_Auta = T_Auta;
        Masa_calkowita = Masa_cal;
        Rok_Produkcji = Rok_Prod;
        Numer_Vin = Numer_V;
        Kolor = Kol;
        Data_Dane = dane;
    }
    public void getDanePods(){
        System.out.println("Nazwa producenta: "+ Nazwa_producenta +"\nNazwa Modelu: "+Nazwa_Modelu+"\nTyp Auta: "+ Typ_Auta+"\nMasa calkowita: "+ Masa_calkowita+ "\nRok_Produkcji: "+ Rok_Produkcji+"\nNumer_Vin: " +Numer_Vin +"\nKolor: " + Kolor);
        Data_Dane.getInfo();
    }
}
