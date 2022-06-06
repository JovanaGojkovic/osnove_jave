package p_03_06_2022_Atleticar;

public abstract class Atleticar {
//    Kreirati apstraktnu klasu Atleticar čiji su tributi:
//    ime i prezime privatni
//    i rezultat ostvaren na takmičenju koji je zasticen
//    Javne metode klase su:
//    apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata
//    drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//    metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

    private String imeIprezime;
    protected double rezultat;

    public abstract boolean boljiJe(Atleticar atleticar);

    public void stampaj(){
        System.out.println("Ime i prezime: " + this.imeIprezime + "Rezultat je: " + this.rezultat);
    }

    public Atleticar(String imeIprezime, double rezultat) {
        this.imeIprezime = imeIprezime;
        this.rezultat = rezultat;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }
}
