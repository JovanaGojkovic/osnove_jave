package p_23_05_2022;

public class Kupac {
//    Kreirati klasu Kupac koja ima:
//    ime i prezime
//    clansku kartu
//    gettere i settere, clanska karta ne moze da se menja
//    konstruktore
//    metodu stampaj koja stampa u formatu
//    ime i prezime - broj kartice

    private String imeIPrezime;
    private ClanskaKarta clanskaKarta;

    public Kupac(String imeIPrezime, ClanskaKarta clanskaKarta){
        this.imeIPrezime = imeIPrezime;
        this.clanskaKarta = clanskaKarta;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }
}
