package pl.edu.zse;

    //5. Zdefiniuj klasę Person:
        //Name
        //Last Name
        //age (przyjmujący wartości do 120 at)
        //date (data przyjęcia do szkoły średniej)
    //6. Zbuduj konstruktor klasy Person przyjmujący jako parametry:
        // wszystkie dane, który uzupełni pola klas oraz wypisz kompletne dane
    //7. Dodaj osobę: Swoje Imię i Nazwisko, wiek, datę przyjęcia do szkoły (trzykrotnie)
        //wywołując każdorazowo inny konstruktor klasy Date

import java.util.Date;

public class SP_22_10_2021_Person {
    private String name;
    private String surname;
    private int age;
    private SP_22_10_2021_Date date;

    public SP_22_10_2021_Person(String name, String surname, int age, SP_22_10_2021_Date date) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.date = date;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<120) {

            this.age = age;
        }
        else{
            System.out.println("Podałeś zły wiek");
        }
    }
    public void getPersonDate_1(){
        System.out.println("IMIE: "+name+", NAZWISKO: "+surname+", WIEK: "+age+", DATA ROZPOCZĘCIA EDUKACJI: "+date.getDay()+"-"+date.getMonthN()+"-"+date.getYear());

    };
    public void getPersonDate_2(){
        System.out.println("IMIE: "+name+", NAZWISKO: "+surname+", WIEK: "+age+", DATA ROZPOCZĘCIA EDUKACJI: "+date.getDay()+"-"+date.getMonthN()+"/"+date.getMonthS()+"-"+date.getYear());

    };
}

