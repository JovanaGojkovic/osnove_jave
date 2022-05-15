package d_13_05_2022;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
//        Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//       Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata
//        iznad, ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite
//          racuna da ne izadjete van opsega niza)
//        U projektu kreirati paket za ovaj domaci d13_05_2022 i u njemu klasu Zadatak1.java i
//        postavite tekst zadataka u komentaru a zatim commit-ujte promenu i push-ujte na github
//        sa porukom “Domaci 13.05.2022 Zadatak 1”
//        Primer izvrsenja:
//        2,4,6,7,4,
//                4,2,5,1,4,
//                1,4,9,4,5,
//                4,8,5,4,7,
//                4,4,7,4,1,
//                Unesite poziciju: 12
//        Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            int randomBroj = random.nextInt(1, 10);
            niz.add(randomBroj);
            if (i % 5 == 4) {
                System.out.println(randomBroj + ",");
            } else {
                System.out.print(randomBroj + ",");
            }
        }
        System.out.println("Unesite poziciju: ");
        int pozicija = s.nextInt();
        boolean imaNevalidnihPozicija = false;
        int srednji = 0;
        int gore = 0;
        int dole = 0;
        int levo = 0;
        int desno = 0;

        if(pozicija < 25) {
            srednji = niz.get(pozicija);
            if (pozicija - 5 > 0) {
                gore = niz.get(pozicija - 5);
            } else {
                imaNevalidnihPozicija = true;
            }
            if (pozicija + 5 < 25) {
                dole = niz.get(pozicija + 5);
            } else {
                imaNevalidnihPozicija = true;
            }
            if (pozicija % 5 != 0){
                levo = niz.get(pozicija - 1);
            }else {
                imaNevalidnihPozicija = true;
            }
            if (pozicija % 5 != 4){
                desno = niz.get(pozicija + 1);
            }else {
                imaNevalidnihPozicija = true;
            }
        } else {
            imaNevalidnihPozicija = true;
        }
        if (imaNevalidnihPozicija) {
            System.out.println("Nevalidna pozicija");
        } else {
            int zbir = srednji + gore + dole + levo + desno;
            System.out.println(zbir);
        }
    }
}
