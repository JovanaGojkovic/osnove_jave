package p_31_05_2022_Paket;

public class EONPaket extends Paket{
//    Kreirati klasu EONPaket koja nasledjuje klasu Paket i koja ima:
//    ovaj paket ima 3 meseca po dinar
//    ovaj paket se zove EON LIGHT DUO
//    brzina interneta ovog paketa je 150/75 MB
//    metodu za stampu koja stampa podatke u formatu:
//    ime i prezime korisnika
//    naziv paketa - brzina download/brzina upload - ugovorna obaveza
//    cena + broj meseci za dinar

    public EONPaket(String nazivPaketa, String imeIprezimeKorisnika, int mesecnaCena, int ugovornaObaveza, double brzinaZaDown, double brzinaZaUp) {
        super("EON LIGHT DUO", imeIprezimeKorisnika, 1, ugovornaObaveza, 150, 75);
        this.brojMeseciPoDinar(3);
    }
    @Override
    public int brojMeseciPoDinar(){
        return brojMeseciPoDinar(3);
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Cena: " + this.mesecnaCena + "Broj meseci za dinar: " + this.brojMeseciPoDinar(3));
    }
}
