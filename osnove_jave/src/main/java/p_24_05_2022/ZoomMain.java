package p_24_05_2022;

public class ZoomMain {
    public static void main(String[] args) {
        ZoomKorisnik korisnik1 = new ZoomKorisnik("Pera Peric");

        ZoomKorisnik korisnik2 = new ZoomKorisnik("Aca Acic");

        ZoomCall call1 = new ZoomCall("www.linkzapoziv.com", "pass123", korisnik2 );

        korisnik1.pretplatiSe(100);

        call1.setGuest(korisnik1);
        call1.pokreniPoziv();
    }
}
