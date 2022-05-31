package p_31_05_2022;

public class Profesor extends Osoba {
    public Profesor(String imeIprezime, String jmbg, String predmet, int plata) {
        super(imeIprezime, jmbg);
        this.plata = plata;
        this.predmet = predmet;
    }
//    Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati implementaciju metode stampaj da stampa sve podatke o profesoru
    private String predmet;
    private int plata;

    public double povecajPlatu(double procenatPovecanja){
        return plata + procenatPovecanja;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Ime i prezime profesora: " + this.imeIprezime + " jmbg: " + this.jmbg +
                            "Predmet: " + this.predmet + "Visina plate: " + this.plata);
    }


}
