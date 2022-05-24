package p_23_05_2022;

public class FB_post {
//    Kreirati klasu FacebookPost
//            opis
//    korisnik (referenca na korisnika koji je kreirao post)
//    konstrukore koje mislite da su vam potrebni
//    metoda print, stampa u formatu:
//            (ime) (prezime)
//            (opis post-a)

    private String nekiTekst;
    private Korisnik korisnik;

    public String getNekiTekst() {
        return this.nekiTekst;
    }

    public void setNekiTekst(String nekiTekst) {
        this.nekiTekst = nekiTekst;
    }

    public Korisnik getKorisnik() {
        return this.korisnik;
    }
   public void setKorisnik(Korisnik korisnik){
        this.korisnik = korisnik;
   }

    public void stampaj(){
        System.out.println(this.korisnik.getKorisnik());
        System.out.println(this.nekiTekst);
    }

}
