package com.company.Napedy;

public class Hybrydowy {
    Elektryczny El;
    Spalinowy Sp;


    public Hybrydowy(Elektryczny elek, Spalinowy spali){
        El = elek;
        Sp = spali;

    }
    public void getHybry(){
        int Suma_Mocy;
        El.getElektryk();
        Sp.getSpaliny();
        Suma_Mocy = El.Moc + Sp.Moc_Konie;
        System.out.println("Moc silnika Hybrydowego" + Suma_Mocy);
    }
}
