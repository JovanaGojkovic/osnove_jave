package p_02_06_2022_Student;

public abstract class Student {
//    Kreirati apstraktnu klasu Student koja ima:
//    ime i prezime studenta
//    broj indeksa
//    godinu studija
//    gettere, settere i konstruktore
//    apstraktnu metodu koja racuna i vraca cenu skolarine.
//    apstraktnu metodu koja vraca da li je student na buzetu ili ne, uvek vraca true
//    metodu koja stampa podatke u formatu:
//    ime i prezime, broj indeksa, godina studija
//    Finansiranje: budzet/samofinansirajuci
//    Cena skolarine: cena
    protected String imeIprezime;
    protected int brojIndexa;
    protected int godinaStudija;

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public Student(String imeIprezime, int brojIndexa, int godinaStudija) {
        this.imeIprezime = imeIprezime;
        this.brojIndexa = brojIndexa;
        this.godinaStudija = godinaStudija;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public abstract int cenaSkolarine();
    public abstract boolean daLiJeNaBudzetu();
    public void stampaj(){
        System.out.println("Ime i prezime: " + this.imeIprezime + ", Broj indeksa: " +
                            this.brojIndexa + ", Godina studija: " + this.godinaStudija +
                            ", Finansiranje: " + this.daLiJeNaBudzetu() + ", Cena skolarine: "
                            + this.cenaSkolarine());
    }
}
