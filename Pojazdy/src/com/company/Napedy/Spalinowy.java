package com.company.Napedy;

public class Spalinowy {
    int Moc_Konie;
    Paliwo Pali_Sp;


    public Spalinowy(int M_Konie, Paliwo Paliwo_Sp){
        Moc_Konie = M_Konie;
        Pali_Sp = Paliwo_Sp;

    }
    public void getSpaliny(){

        System.out.println("Moc silnika -"+ Moc_Konie);
        Pali_Sp.getPaliwo();
    }
}


    //int MK, String Typ, String ZuP, int PojZb, String Mat
    //    Moc_Konie = MK;
     //   Typ, ZuP, PojZb, Mat