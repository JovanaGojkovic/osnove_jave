package p_24_05_2022;

public class Ugovor {
//    Kreirati klasu Ugovor koja ima:
//    godinu, dan i mesec sklapanja ugovora
//    osobu koja prodaje nekretninu (fizicko lice)
//    osobu koja kupuje nekretninu (fizicko lice)
//    cenu za koju se prodaje nekretnina
//    adresu nekretnine (ulica br., grad)
//    metodu koja vraca procenat zarade
//    za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//    metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije,
//    prema formuli:
//    1000 + cena za koju se prodaje * procenat zarade
//    metodu koja stampa ugovor u formatu:
//    Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o
//    kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji
//    isplati novcanu vrednost u iznosu od (zarada agencije)
    private String datumUgovora;
    private int cena;
    private FizickoLice kupac;
    private FizickoLice prodavac;
    private String adresaNekretnine;

    public Ugovor(String datumUgovora, int cena, FizickoLice kupac, FizickoLice prodavac, String adresaNekretnine) {
        this.datumUgovora = datumUgovora;
        this.cena = cena;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.adresaNekretnine = adresaNekretnine;
    }

    public double procenatZarade(){
        if (kupac.isVecKupovali()){
            return  0.2;
        }else {
            return  0.3;
        }
    }
    public double zaradaAgencije(){
        return 1000 + this.cena * this.procenatZarade();
    }
    public void stampaj(){
        System.out.println("Dana " + this.datumUgovora + "sklopljen je ugovor izmedju: ");
        System.out.print(Ugovor.this.prodavac.getPunoIme() + " i ");
        System.out.print(Ugovor.this.kupac.getPunoIme() + " o kupovini nekretnine ");
        System.out.print(this.adresaNekretnine + " po ceni od " + this.cena);
        System.out.println(" pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od: " + this.zaradaAgencije());
    }
}
