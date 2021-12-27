package com.company.Napedy;

public class Zbiornik {
    int pojemnosc_zbior;
    String material_zbior;

    public Zbiornik(int pojemnosc, String material){
        pojemnosc_zbior = pojemnosc;
        material_zbior = material;
    }
    public void getZbiornik(){

        System.out.println("Pojemność zbiornika to: "+ pojemnosc_zbior +"\nMaterial wykonania zbiornika: "+ material_zbior);
    }
}


// int PojZb, String Mat
//pojemnosc_zbior = PojZb;
//material_zbior = Mat;