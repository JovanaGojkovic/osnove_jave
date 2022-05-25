package p_24_05_2022;

public class FizickoLice {
//    Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//    ime i prezime
//    broj licne karte
//    jmbg
//    podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//    konstuktore
//    gettere i settere, jmbg ne sme da se menja
//    metodu stampaj, koja stmpa podatke u formatu:
//    ime i prezime, broj licne karte

    private String punoIme;
    private int brojLK;
    private String jmbg;
    private boolean vecKupovali  = true;

    public FizickoLice(String punoIme, int brojLK, String jmbg, boolean vecKupovali) {
        this.punoIme = punoIme;
        this.brojLK = brojLK;
        this.jmbg = jmbg;
        this.vecKupovali = vecKupovali;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(int brojLK) {
        this.brojLK = brojLK;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isVecKupovali() {
        return vecKupovali;
    }

    public void setVecKupovali(boolean vecKupovali) {
        this.vecKupovali = vecKupovali;
    }
    public void stampaj(){
        System.out.println(this.punoIme + " , " + this.brojLK);
    }
}
