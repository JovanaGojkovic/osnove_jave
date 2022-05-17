package p_16_05_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        5. Zadatak
//        Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost
//        prosledjene vrednosti.
        apsVrednost(9);
    }
    static void apsVrednost(int x) {
        if (x < 0) {
            System.out.println("Apsolutna vrednost je: " + x * -1);
        } else {
            System.out.println("Apsolutna vrednost je: " + x);
        }
    }
}
