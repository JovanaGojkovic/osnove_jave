package p_16_05_2022;

public class Zadatak9 {
    public static void main(String[] args) {
//        9.Zadatak
//        Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        6 - VI
//        7 - VII
//        8 - VIII
//        9 - IX
//        10 - X
//        Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
//        Ako se unese VIII vraca se 8.
//        VIII => 8
        String rimski = "X";
       int arapski = arapskiBroj("II");
        System.out.println(arapski);
    }
    static int arapskiBroj(String rimskiBroj) {
        if (rimskiBroj.equals("I")) {
            return 1;
        } else if (rimskiBroj.equals("II")) {
            return 2;
        } else if (rimskiBroj.equals("III")) {
            return 3;
        } else if (rimskiBroj.equals("IV")) {
            return 4;
        } else if (rimskiBroj.equals("V")) {
            return 5;
        } else if (rimskiBroj.equals("VI")) {
            return 6;
        } else if (rimskiBroj.equals("VII")) {
            return 7;
        } else if (rimskiBroj.equals("VIII")) {
            return 8;
        } else if (rimskiBroj.equals("IX")) {
            return 9;
        } else if (rimskiBroj.equals("X")) {
            return 10;
        }
        else {
            return 0;
        }

    }
}