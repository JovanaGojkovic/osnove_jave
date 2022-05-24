package p_23_05_2022;

public class FbMain {
    public static void main(String[] args) {

        FB_post prviPost = new FB_post();
        prviPost.setNekiTekst("Srecan rodjendan");
       // prviPost.stampaj();

        Korisnik prviKorisnik = new Korisnik();
        prviKorisnik.setKorisnik("Jovana Gojkovic");
//        prviKorisnik.stampaj();



        prviPost.setKorisnik(prviKorisnik);
        prviPost.stampaj();


    }
}
