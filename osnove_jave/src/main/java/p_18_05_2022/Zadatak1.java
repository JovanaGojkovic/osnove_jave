package p_18_05_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i
//		ostampati podatke za svaki objekat.

        Racun r = new Racun();
        r.racun = "840-23932-323";
        r.ime = "Jovana";
        r.prezime = "Gojkovic";
        r.stanje = 1000;

        Racun b = new Racun();
        b.racun = "840-23932-423";
        b.ime = "Petar";
        b.prezime = "Petrovic";
        b.stanje = 6000;

        System.out.println(r.ime);
        System.out.println(r.prezime);
        System.out.println(r.racun);
        System.out.println(r.stanje);
        System.out.println(b.ime);
        System.out.println(b.prezime);
        System.out.println(b.racun);
        System.out.println(b.stanje);
//        Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
//        Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//        Primer izvrsenja:
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//        Primalac: Marko Markovic, 840-23932-334, stanje: 200
//        Unesite sumu za transakciju: 500
//        Stanje nakon stransakcije
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//        Primalac: Marko Markovic, 840-23932-334, stanje: 700

        System.out.println("Posiljalac " + r.ime + ", " + r.racun + ", " + r.stanje);
        System.out.println("Primalac " + b.ime + ", " + b.racun + ", " + b.stanje);
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite sumu za transakciju");
        int transakcija = s.nextInt();
        r.stanje = r.stanje - transakcija;
        b.stanje = b.stanje + transakcija;
        System.out.println("Posiljalac " + r.ime + ", " + r.racun + ", " + r.stanje);
        System.out.println("Primalac " + b.ime + ", " + b.racun + ", " + b.stanje);


    }
}
