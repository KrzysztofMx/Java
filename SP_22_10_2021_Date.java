package pl.edu.zse;

import java.util.Date;

//2. Zdefiniuj odpowiednio klasę Date - prywatne pola klasy:
        //year
        //monthNumber
        //monthString
        //day
            //inicjując odpowietnie typy danych
    //3. Zdefiniuj trzy konstruktory wywołujące metody:
        //ustawiające odpowiednie daty i je wyświetlające
    //4. Konstruktor przyjmuje
        //Pierwszy jako parametry wartości liczbowe
        //Drugi jako parametry liczbowe + miesiąc (tablica znaków)
        //Trzeci obiekt Date
//
class SP_22_10_2021_Date {
    private int year;
    private int monthN;
    private String monthS;
    private int day;

    public SP_22_10_2021_Date(int year, int monthN, int day) {
        setDate1(year, monthN, day);
        outDate1(year, monthN, day);
    }
    public void setDate1(int year, int monthN, int day){
        this.year = year;
        this.monthN = monthN;
        this.day = day;
    }
    public void outDate1(int year, int monthN, int day){
        System.out.println(day+"-"+monthN+"-"+year);
    }

    public SP_22_10_2021_Date(int year, int monthN, String monthS, int day) {
        setDate2(year,monthN, monthS, day);
        outDate2(year,monthN, monthS, day);
    }
    public void setDate2(int year,int monthN, String monthS, int day) {
        this.year = year;
        this.monthN = monthN;
        this.monthS = monthS;
        this.day = day;
    }
    public void outDate2(int year,int monthN, String monthS, int day){
        System.out.println(day+"-"+monthN+"/"+monthS+"-"+year);
    }

    public SP_22_10_2021_Date(SP_22_10_2021_Date date) {
        setDate3(date);
        outDate3(date);
    }
    public void setDate3(SP_22_10_2021_Date date){
        this.year=date.getYear();
        this.monthN=date.getMonthN();
        this.monthS=date.getMonthS();
        this.day=date.getDay();
    }
    public void outDate3(SP_22_10_2021_Date date){
        System.out.println(getYear()+"-"+getMonthN()+"-"+getMonthS()+"-"+getDay());
    }

    public int getYear() {
        return year;
    }
    public int getMonthN() {
        return monthN;
    }
    public String getMonthS() {
        return monthS;
    }
    public int getDay() {
        return day;
    }
}