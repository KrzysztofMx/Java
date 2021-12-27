public class Cwiczenie1_TypyDanych {

    public void CzyPrawda(){
        boolean a = false;
        boolean b = false;

        System.out.printf("a: %b %n", a);
        System.out.printf("b: %b %n", b);

        a = a == b;

        System.out.printf("a: %b %n", a);
    }

    public void TypZnakowy(){
        char znak1 = '1';
        char znak2 = 199;

        System.out.printf("znak 1: %c %n", znak1);
        System.out.printf("znak 2: %c %n", znak2);
    }

    public void TypLiczbCalkowitych(){
        long nrtel = 543_432_321L; // gdy jest long potrzebny jest L na koniec
        int bin = 0b101;//binarny
        int hex = 0x1A;//szesnastkowy
        int oct = 073; //ósemkowy
        int dec = 13; // dziesiętny
        System.out.printf("Nr Telefonu: %d %n", nrtel);
        System.out.printf("System Binarny: %d %n", bin);
        System.out.printf("System Szesnastkowy: %d %n", hex);
        System.out.printf("System Binarny: %d %n", oct);
        System.out.printf("System Dziesiętny: %d %n", dec);
    }

    public void Cwiczenie_1(){
        long lx = 10L; // gdy jest long potrzebny jest L na koniec
        int ix = (int) lx;// do inta dajemy long gdy jest (int) lub (double) w tedy mamy long w double
        System.out.print(ix);
    }

    public void TypLiczbRzeczywistych(){
        float x = 1.1F; // gdy jest float potrzebny jest F na koniec
        double big = 13;
        double cena = 13;
        System.out.printf("Float jest równy: %f %n", x);
        System.out.printf("Double-Big jest równy: %f %n", big);
        System.out.printf("Double-cena jest równa: %f %n", cena);

        System.out.printf("Float-MAX jest równa: %f %n", Float.MAX_VALUE);//maksymalna wartość float
    }
}
