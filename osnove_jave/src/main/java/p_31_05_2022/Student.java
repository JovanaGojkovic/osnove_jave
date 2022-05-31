package p_31_05_2022;

public class Student extends Osoba{
    public Student(String imeIprezime, String jmbg, int brojIndexa, int dugZaSkolarinu) {
        super(imeIprezime, jmbg);
        this.brojIndexa = brojIndexa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
//    Kreirati klasu Student koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    broj indeksa
//    dug za skolarinu
//    konstuktor sa parametrima
//    metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//    Napisati implementaciju metode stampaj da stampa sve podatke o studentu

    private int brojIndexa;
    private int dugZaSkolarinu;

    public int getBrojInexa() {
        return brojIndexa;
    }

    public void setBrojInexa(int brojInexa) {
        this.brojIndexa = brojInexa;
    }

    public int getDugZaSkolarinu() {
        return dugZaSkolarinu;
    }

    public void setDugZaSkolarinu(int dugZaSkolarinu) {
        this.dugZaSkolarinu = dugZaSkolarinu;
    }
    public int uplatiSkolarinu(int uplata){
        if (uplata > dugZaSkolarinu){
            return 0;
        }else {
            return dugZaSkolarinu = dugZaSkolarinu - uplata;
        }
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj indeksa: " + this.brojIndexa + " Dug za skolarinu: " + this.dugZaSkolarinu);
    }
}
