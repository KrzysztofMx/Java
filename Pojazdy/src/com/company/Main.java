package com.company;

import com.company.Napedy.*;

public class Main {
    public static void main(String[] args) {

                        Zbiornik zbiornik1 = new Zbiornik(800 ,"welna");
                    Paliwo paliwo1 = new Paliwo("Bezyna","20 litrów",zbiornik1);
                Spalinowy spal1= new Spalinowy(600,paliwo1);

                        PojemnoscAkl pojem1 = new PojemnoscAkl(800);
                Elektryczny elek1 = new Elektryczny(400,20,pojem1);

                Hybrydowy hybr1 = new Hybrydowy(elek1, spal1);

            Naped nap1 = new Naped("Przód", "Spalinowy",spal1, elek1, hybr1);

                Data_Rejestracji Dat1 = new Data_Rejestracji(2007,5,17);
            Dane_Podstawowe Dane1= new Dane_Podstawowe("Opel","Astra","Kombi","1800 kilogramow",
                                                        "2004 rok","JTEBT17R750049760","Srebrny",Dat1);
        Samochod samochod1 = new Samochod(nap1,Dane1);


        Wlasciciel wlas1 = new Wlasciciel("Krzysztof","Marx", "Myslowice");
        Wspol_Wlasciciel wspol1 = new Wspol_Wlasciciel("Marcin","Gortat","Sosnowiec");

        Data_wyrejestrowania Wdat1 = new Data_wyrejestrowania(2010,12,3);

    Rejestracja auto1 = new Rejestracja("AA-0000", samochod1, wlas1, wspol1, Dat1, Wdat1);
        auto1.getRejestracja();

///AUTO 2

                    Zbiornik zbiornik2 = new Zbiornik(800 ,"Poliester");
                Paliwo paliwo2 = new Paliwo("Olej Napedowy","15 litrów",zbiornik2);
            Spalinowy spal2 = new Spalinowy(650,paliwo2);

                PojemnoscAkl pojem2 = new PojemnoscAkl(100);
            Elektryczny elek2 = new Elektryczny(700,50,pojem2);

            Hybrydowy hybr2 = new Hybrydowy(elek2, spal2);

        Naped nap2 = new Naped("Tył", "Hybrydowy",spal2, elek2, hybr2);

        Data_Rejestracji Dat2 = new Data_Rejestracji(2018,5,17);
        Dane_Podstawowe Dane2= new Dane_Podstawowe("Volkswagen","Golf","Kombi","1200 kilogramow",
                "2018 rok","GHJYT17R750049760","Czarny",Dat2);
        Samochod samochod2 = new Samochod(nap2,Dane2);

        Wlasciciel wlas2 = new Wlasciciel("Michał","Brzęczyszczykiewicz", "Gliwice");
        Wspol_Wlasciciel wspol2 = new Wspol_Wlasciciel("Marcin","Pazdan","Gdańsk");

        Data_wyrejestrowania Wdat2 = new Data_wyrejestrowania(2022,12,3);

        Rejestracja auto2 = new Rejestracja("BB-2222", samochod2, wlas2, wspol2, Dat2, Wdat2);
    auto2.getRejestracja();


//AUTO 3
                    Zbiornik zbiornik3 = new Zbiornik(2000 ,"Uran");
                Paliwo paliwo3 = new Paliwo("Bęzyna","1 litr",zbiornik3);
            Spalinowy spal3 = new Spalinowy(1500,paliwo3);

                PojemnoscAkl pojem3 = new PojemnoscAkl(7000);
            Elektryczny elek3 = new Elektryczny(10000,5,pojem3);

            Hybrydowy hybr3 = new Hybrydowy(elek3, spal3);

        Naped nap3 = new Naped("4x4", "Elektryczny",spal3, elek3, hybr3);

        Data_Rejestracji Dat3 = new Data_Rejestracji(2058,5,17);
        Dane_Podstawowe Dane3 = new Dane_Podstawowe("Citroen","C4","Kombi","100 kilogramow",
                "2050 rok","XXXXXXXXXXXXXXXXX","Biały",Dat3);
        Samochod samochod3 = new Samochod(nap3,Dane3);

        Wlasciciel wlas3 = new Wlasciciel("Pan","Adolf", "Berlin");
        Wspol_Wlasciciel wspol3 = new Wspol_Wlasciciel("Pan","Józef","Moskwa");

        Data_wyrejestrowania Wdat3 = new Data_wyrejestrowania(2077,12,3);

        Rejestracja auto3 = new Rejestracja("CC-3333", samochod3, wlas3, wspol3, Dat3, Wdat3);
        auto3.getRejestracja();

    }
}
