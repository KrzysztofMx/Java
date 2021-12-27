package com.company.Napedy;

public class Elektryczny {
    int Moc;
    int zuzycie_pradu_100km;
    PojemnoscAkl pojem;

    public Elektryczny(int Power, int zuzycie_pradu, PojemnoscAkl pojemnosc ){
        Moc = Power;
        zuzycie_pradu_100km = zuzycie_pradu;
        pojem = pojemnosc;

    }
    public void getElektryk(){
           System.out.println("Moc silnika elektrycznego to: " + Moc + "zurzycie pradu na 100km "+ zuzycie_pradu_100km);
           pojem.getPojemAlk();
    }
}


