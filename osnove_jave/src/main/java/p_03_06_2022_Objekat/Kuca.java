package p_03_06_2022_Objekat;

public class Kuca extends Objekat{

//    Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//    konstuktore, gettere i setter
//    porez racuna po formuli: koeficijent * povrsina.
//    prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

    private int brojClanova;

    public Kuca(String adresa, double povrsina, double zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }
    @Override
    public double porezObjekta(){
        return koeficijent() * povrsina;
    }
    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.adresa + " Povrsina: " + this.povrsina + " Zona: "
                        + this.zona + " Broj clanova: " + this.brojClanova + " Porez: " + this.porezObjekta());
    }
}

