package p_31_05_2022;

public class Osoba {
//    Kreirati klasu Osoba koja od atributa ima:
//    ime i prezime
//            jmbg
//    konstuktor sa parametrima
//    metodu stampaj koja stampa podatke u formatu
//    ime prezime, jmbg
    protected String imeIprezime;
    protected String jmbg;

    public Osoba(String imeIprezime, String jmbg) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
    }
    public void stampaj(){
        System.out.println("Ime i prezime: " + this.imeIprezime + " jmbg: " + this.jmbg);
    }
}
