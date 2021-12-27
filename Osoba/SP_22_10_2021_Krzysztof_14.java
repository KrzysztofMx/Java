package pl.edu.zse;


import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

//1. Stwórz trzy klasy
    //Imię_Nr_w_Dzienniku(z metodą main)
    //Date               [POLECENIA : 2-4]
    //Person             [POLECENIA : 5-7]
public class SP_22_10_2021_Krzysztof_14 {
    public static void main (String[] args){

        SP_22_10_2021_Date date_1 = new SP_22_10_2021_Date(1997,9,1);

        SP_22_10_2021_Date date_2=new SP_22_10_2021_Date(2000,6,"Czerwiec",24);
        SP_22_10_2021_Date date_3= new SP_22_10_2021_Date(date_2);

        System.out.println("_____________________________________");
        
        SP_22_10_2021_Person person_1= new SP_22_10_2021_Person("ELO", "Marx", 31,date_1);
        person_1.getPersonDate_1();

        SP_22_10_2021_Person person_2= new SP_22_10_2021_Person("Krzysztof", "Marx", 2,date_2);
        person_2.getPersonDate_2();

        SP_22_10_2021_Person person_3= new SP_22_10_2021_Person("Siema", "Marx", 2,date_3);
        person_3.getPersonDate_2();
    }
}
