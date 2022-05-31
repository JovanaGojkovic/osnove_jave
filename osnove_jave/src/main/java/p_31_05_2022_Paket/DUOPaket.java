package p_31_05_2022_Paket;

public class DUOPaket extends Paket{
//    Kreirati klasu DUOPaket koaj nasledjuje klasu Paket i koja ima:
//    ovaj paket ima 6 meseci po dinar
//    naziv paketa je EON FULL DUO
//    uredjaj koji dodatno ide uz ovaj paket (moze biti fiksni/mobilni/tablet/laptop)
//    brzina interneta ovog paketa je 250/100 MB
//    metodu za povecanje brzine interneta, kao parametar se unosi koliko je to uvecanje
//    metodu za stampu
//    ime i prezime korisnika
//    naziv paketa - brzina download/brzina upload - ugovorna obaveza
//    cena + broj meseci za dinar


    public DUOPaket(String nazivPaketa, String imeIprezimeKorisnika, int mesecnaCena, int ugovornaObaveza, double brzinaZaDown, double brzinaZaUp,  String dodatniUredjaj) {
        super("EON FULL DUO", imeIprezimeKorisnika, mesecnaCena, ugovornaObaveza, 250, 100);
        this.brojMeseciPoDinar(6);
        this.dodatniUredjaj = dodatniUredjaj;
    }
    private String dodatniUredjaj;

    public double povecanjeBrzine(double povecanje){
        return this.brzinaZaDown + povecanje;
    }
    @Override
    public int brojMeseciPoDinar(){
       return brojMeseciPoDinar(6);
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Cena: " + this.mesecnaCena + "Broj meseci za dinar: " + this.brojMeseciPoDinar(6) + "Poklon uredjaj: " + this.dodatniUredjaj);
    }
}
