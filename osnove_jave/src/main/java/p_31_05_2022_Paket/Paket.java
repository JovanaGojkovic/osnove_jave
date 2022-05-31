package p_31_05_2022_Paket;

public abstract class Paket {
//    Kreirati klasu Paket koja ima:
//    naziv paketa
//    ime i prezime korisnika
//    mesecnu cenu
//    ugovorna obaveza
//    brzina interneta za download
//    brzina interneta za upload
//    getere, setere i konstuktore koji su logicni (brzine interneta nije moguce menjati kao i naziv paketa)
//    metodu produzi ugovor koja produzava ugovor za 12 meseci
//    metodu koja vraca broj meseci koliko korisnik ima po dinar. Uvek vraca nulu
//    metodu za stampu koja stampa podatke u formatu:
//    ime i prezime korisnika
//    naziv paketa - brzina download/brzina upload - ugovorna obaveza
//    cena
    protected String nazivPaketa;
    protected String imeIprezimeKorisnika;

    public void setImeIprezimeKorisnika(String imeIprezimeKorisnika) {
        this.imeIprezimeKorisnika = imeIprezimeKorisnika;
    }

    public void setMesecnaCena(int mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    protected int mesecnaCena;
    protected int ugovornaObaveza;
    protected double brzinaZaDown;
    protected double brzinaZaUp;

    public String getNazivPaketa() {
        return nazivPaketa;
    }

    public String getImeIprezimeKorisnika() {
        return imeIprezimeKorisnika;
    }

    public int getMesecnaCena() {
        return mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public double getBrzinaZaDown() {
        return brzinaZaDown;
    }

    public double getBrzinaZaUp() {
        return brzinaZaUp;
    }

    public Paket(String nazivPaketa, String imeIprezimeKorisnika, int mesecnaCena, int ugovornaObaveza, double brzinaZaDown, double brzinaZaUp) {
        this.nazivPaketa = nazivPaketa;
        this.imeIprezimeKorisnika = imeIprezimeKorisnika;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.brzinaZaDown = brzinaZaDown;
        this.brzinaZaUp = brzinaZaUp;
    }
    public void produziUgovor(){
        ugovornaObaveza += 12;
    }
    public int brojMeseciPoDinar(int brojMeseciPoDinar){
        return 0;
    }

    public abstract int brojMeseciPoDinar();

    public void stampaj(){
        System.out.println("Ime i prezime korisnika: " + this.imeIprezimeKorisnika);
        System.out.println("Naziv paketa: " + this.nazivPaketa + " - " + this.brzinaZaDown + "/" + this.brzinaZaUp
                            + " - " + "Ugovorna obaveza: " + this.ugovornaObaveza);
    }
}
