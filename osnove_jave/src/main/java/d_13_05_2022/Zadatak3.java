package d_13_05_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti
//        (ne u nosi ih korisnik) a zatim se od korisnika ucitava pozicija elementa koji zeli da
//        izbaci iz niza. Pre i nakon izbacivanja ispisati niz na ekranu. Ukoliko korisnik unese poziciju
//        van opsega niza, ispisati poruku o gresci.
//        Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
//        Primer izvrsenja 1:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 5
//        Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
//        Primer izvrsenja 2:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 11
//        Uneli ste nevalidnu poziciju
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int pozicija = 0;

        for (int i = 0; i < 10; i++) {
            int randomBroj = random.nextInt(1, 10);
            niz.add(randomBroj);
            if (niz.size() == 10) {
                System.out.println(niz);
            }
        }
        for (int i = 0; i < niz.size(); i++) {
            System.out.println("Unesite poziciju za izbacivanje: ");
            pozicija = s.nextInt();
            if (pozicija > niz.size()) {
                System.out.println("Uneli ste nevalidnu poziciju");
            } else {
                if (niz.contains(niz.get(pozicija))) {
                    niz.remove(niz.get(pozicija));
                    System.out.println("Niz nakon brisanja je " + niz);
                }
            }
        }
    }
}



