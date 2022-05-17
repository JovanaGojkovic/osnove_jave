package p_16_05_2022;

public class Zadatak3 {
    public static void main(String[] args) {
//        .Napisati metodu koja stampa zvezdicu sa razmakom. U glavnom programu je
//        potrebno odstampati sledecu sliku:
//        *  *  *
//        *  *
//        *
//        Primer 2:
//          * * * * * *
//          * * * * *
//	        * * * *
//	        * * *
//	        * *
//	        *

//        zvezdice();
//        zvezdice();
//        zvezdice();
//        System.out.println(" ");
//        zvezdice();
//        zvezdice();
//        System.out.println(" ");
//        zvezdice();

        for (int i = 0; i < 6; i++) {
                zvezdice();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
           zvezdice();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            zvezdice();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            zvezdice();
        }
        System.out.println();
       for (int i = 0; i < 2; i++) {
           zvezdice();
        }
        System.out.println();
        zvezdice();
    }
    static void zvezdice() {
        System.out.print("* ");
    }
}
