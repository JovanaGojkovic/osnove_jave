package p_23_05_2022;

public class OsobaMain {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Jovana Gojkovic" );
        Osoba majka = new Osoba("Ninoslava Potic");
        Osoba otac = new Osoba("Miroljub Potic");
        Osoba ocevOtac = new Osoba("Bozidar Potic");
        Osoba ocevaMajka = new Osoba("Nadezda Potic");
        Osoba majcinOtac = new Osoba("Radoje Milacic");
        Osoba majcinaMajka = new Osoba("Ljiljana Milacic");


        osoba.setMajka(majka);
        osoba.setOtac(otac);
        osoba.getOtac().setOtac(ocevOtac);
        osoba.getOtac().setMajka(ocevaMajka);
        osoba.getMajka().setOtac(majcinOtac);
        osoba.getMajka().setMajka(majcinaMajka);

        osoba.print();
    }
}
