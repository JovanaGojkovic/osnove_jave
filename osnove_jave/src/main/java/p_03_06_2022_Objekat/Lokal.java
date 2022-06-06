package p_03_06_2022_Objekat;

public class Lokal extends Objekat{
//    Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//    konstuktore
//    porez racuna po formuli koeficijent * povrsina * 1.3
//    prepisati metodu stampaj tako da stampa sve podatke vezane za lokal


    public Lokal(String adresa, double povrsina, double zona) {
        super(adresa, povrsina, zona);
    }
    @Override
    public double porezObjekta(){
        return koeficijent() * this.povrsina * 1.3;
    }
    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.adresa + " " + "Povrsina: " + this.povrsina + " Zona:"
                            + this.zona + " Porez: " + this.porezObjekta());
    }
}
