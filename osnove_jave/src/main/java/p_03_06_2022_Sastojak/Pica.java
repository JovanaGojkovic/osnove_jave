package p_03_06_2022_Sastojak;

public class Pica extends Proizvod{
//    Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
//    cena podloge
//    override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
//    override uje metodu stampaj da stampa sve podatke

    private int cenaPodloge;

    public Pica(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int racunajUkupnuCenu(){
       return cenaSvihSastojaka() + this.cenaPodloge;
    }
    @Override
    public void stampaj(){
        System.out.println("Cena pice sa svim sastojcima je: " + racunajUkupnuCenu());
    }



}
