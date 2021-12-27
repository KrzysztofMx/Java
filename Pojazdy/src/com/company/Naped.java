package com.company;

import com.company.Napedy.Elektryczny;
import com.company.Napedy.Hybrydowy;
import com.company.Napedy.Spalinowy;

public class Naped {
    String naped;
    String Rodz_Nap;
    Spalinowy Nap_Sp;
    Elektryczny Nap_El;
    Hybrydowy Nap_Hyb;

    public Naped(String nap,String Rodz, Spalinowy Sp, Elektryczny El, Hybrydowy Hy){
        naped = nap;
        Rodz_Nap = Rodz;
        Nap_Sp = Sp;
        Nap_El = El;
        Nap_Hyb = Hy;
    }
    public void getNaped(){

        if(Rodz_Nap == "Spalinowy"){
            System.out.println("Auto posiada napęd na "+ naped );
            Nap_Sp.getSpaliny();
        }else if(Rodz_Nap == "Elektryczny"){
            System.out.println("Auto posiada napęd na "+ naped );
            Nap_El.getElektryk();
        }else if(Rodz_Nap == "Hybrydowy"){
            System.out.println("Auto posiada napęd na "+ naped );
            Nap_Hyb.getHybry();
        }else{
            System.out.println("Do wyboru Spalinowy, Elektryczny, Hybrydowy");
        }

    }
}
