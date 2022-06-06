package p_03_06_2022_Sastojak;

import java.util.ArrayList;

public abstract class Proizvod {
//    Kreirati abstraktnu klasu Proizvod koja ima:
//    niz dodataka
//    metodu ubaciDodatak koja dodaje dodatak u niz
//    metodu koja vraca cenu svih dodataka koje ima proizvod
//    abstraktnu metodu ukupnu racunaj cenu
//    abstraktnu metodu stampaj

    protected ArrayList<Sastojak> nizSastojaka = new ArrayList<>();

    public ArrayList<Sastojak> getNizSastojaka() {
        return nizSastojaka;
    }

    public void setNizSastojaka(ArrayList<Sastojak> nizSastojaka) {
        this.nizSastojaka = nizSastojaka;
    }

    public void ubaciSastojak(Sastojak sastojak){
        nizSastojaka.add(sastojak);
    }
    public int cenaSvihSastojaka(){
        int sumaSastojaka = 0;
        for (int i = 0; i < nizSastojaka.size(); i++) {
            return sumaSastojaka += nizSastojaka.get(i).getCena();
        }return sumaSastojaka;
    }
    public abstract int racunajUkupnuCenu();
    public abstract void stampaj();
}
