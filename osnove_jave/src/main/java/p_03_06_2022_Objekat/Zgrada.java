package p_03_06_2022_Objekat;

public class Zgrada extends Objekat{
//    Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//    broj stanova
//    konstuktore, gettere i setter
//    porez racuna po formuli koeficijent * povrsina * broj stanova
//    prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu

    private int brojStanova;

    public Zgrada(String adresa, double povrsina, double zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
    @Override
    public double porezObjekta(){
        return koeficijent() * this.povrsina * this.brojStanova;
    }
    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.adresa + " Povrsina: " + this.povrsina + " Broj stanova: "
                        + this.brojStanova + " " + "Zona: " + this.zona + " Porez: " + this.porezObjekta());
    }
}
