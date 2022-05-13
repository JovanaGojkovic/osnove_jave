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

        for (int i = 0; i < 25 ; i++) {
            int randomBroj = random.nextInt(1,10);
            niz.add(randomBroj);
            if (i % 5 == 4){
                System.out.println(randomBroj + ",");
            }else {
                System.out.print(randomBroj + ",");
            }
        }
        System.out.println("Unesite poziciju: ");
        int pozicija = s.nextInt();

        int srednji = niz.get(pozicija);
        int gore = 0;
        if (pozicija - 5 > 0){
            gore = niz.get(pozicija - 5);
        }

        int dole = niz.get(pozicija + 5);
        int levo = niz.get(pozicija - 1);
        int desno = niz.get(pozicija + 1);

        int zbir = srednji + gore + dole + levo + desno;
        System.out.println(zbir);



    }
}
