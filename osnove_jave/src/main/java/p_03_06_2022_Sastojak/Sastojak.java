package p_03_06_2022_Sastojak;

public class Sastojak {
//    Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//    naziv dodatka
//    cenu dodatka
//    konstruktore, gettere i settere koji su vam potrebni
//    metodu stampaj koja stampa u formatu:
//            (dodatak)  (cena)
    private String naziv;
    private int cena;

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public void stampaj(){
        System.out.println(this.naziv + " " + this.cena);
    }
}
