package p_23_05_2022;

public class Korisnik {
//    Kreirati klasu Korisnik koja ima
//            ime
//    prezime
//    gettere i settere za ime i prezime
//    konstuktore koje mislite da su vam potrebni
//    metoda koja stampa u formatu:
//            (ime) (prezime)

    private String korisnik;

    public String getKorisnik() {
        return this.korisnik;
    }

    public void setKorisnik(String imeKorisnika) {
        this.korisnik = imeKorisnika;
    }
    public void stampaj(){
        System.out.println(this.korisnik);
    }

}



