package p_23_05_2022;

public class Film {
//    Kreirati klasu Film koja ima:
//    naziv filma
//    iz koje godine je film
//    konstruktore, gettere i settere koji su potrebni
//    metodu print koja stampa podatke u formatu
//    naziv filma, godina

    private String nazivFilma;
    private int godinaIzdanja;

    public String getNazivFilma() {
        return this.nazivFilma;
    }

    public int getGodinaIzdanja() {
        return this.godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public void stampaj() {
        System.out.println(this.nazivFilma + " " + this.godinaIzdanja);
    }
}
