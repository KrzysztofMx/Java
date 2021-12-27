package com.company.Napedy;

import java.security.PublicKey;

public class Paliwo {
    String Inf_typ;
    String Zurzycie_pal;
    Zbiornik Zbior;

    public Paliwo(String Inf_typ_paliwa, String Zurzycie_Paliwa, Zbiornik Zbiornik){
        Inf_typ = Inf_typ_paliwa;
        Zurzycie_pal = Zurzycie_Paliwa;
        Zbior = Zbiornik;

    }

    public void getPaliwo(){

        if(Inf_typ == "Olej Napedowy"){
            System.out.println("Typ paliwa to Olej napędowy, średnie zurzycie paliwa na 100km: "+ Zurzycie_pal );
            System.out.println("-----Zbiornik----" );
            Zbior.getZbiornik();
        }else if(Inf_typ == "Bezyna"){
            System.out.println("Typ paliwa to Bęzna, średnie zurzycie paliwa na 100km: "+ Zurzycie_pal);
            System.out.println("-----Zbiornik----" );
            Zbior.getZbiornik();
        }else{
        System.out.println("Typ paliwa -> Bezyna i Olej Napedowy");
            System.out.println("-----Zbiornik----" );
            Zbior.getZbiornik();
        }
    }
}

 //   String Typ, String ZuP, int PojZb, String Mat
 //       Inf_typ = Typ;
 //       Zurzycie_pal = ZuP;
//PojZb, Mat