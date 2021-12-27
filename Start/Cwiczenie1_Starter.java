public class Cwiczenie1_Starter {
    public static void main(String[] args){
        Cwiczenie1_TypyDanych Cw1Td = new Cwiczenie1_TypyDanych();

        String zdanie = ("+----------------------------+");

        System.out.println(zdanie);
        System.out.println("+---------Czy Prawda---------+");
        System.out.println(zdanie);
        Cw1Td.CzyPrawda();

        System.out.println(" ");

        System.out.println(zdanie);
        System.out.println("+--------Typ: Znakowy--------+");
        System.out.println(zdanie);
        Cw1Td.TypZnakowy();

        System.out.println(" ");

        System.out.println(zdanie);
        System.out.println("+---Typ: Liczb Całkowitych---+");
        System.out.println(zdanie);
        Cw1Td.TypLiczbCalkowitych();

        System.out.println(" ");

        System.out.println(zdanie);
        System.out.println("+--------Cwiczenie_01--------+");
        System.out.println(zdanie);
        Cw1Td.Cwiczenie_1();

        System.out.println(" ");

        System.out.println(zdanie);
        System.out.println("+--Typ: Liczb Rzeczywistych--+");
        System.out.println(zdanie);
        Cw1Td.TypLiczbRzeczywistych();



    }
}
