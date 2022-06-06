package p_03_06_2022_Objekat;

import p_03_06_2022_Sastojak.Sastojak;

import java.util.ArrayList;

public class PoreskaUprava {
//    Kreirati klasu PoreskaUprava koja za atribute ima:
//    ime grada u kom se nalazi
//    niz objekata
//    metodu dodaj objekat
//    metodu koja vraca objekat sa najvecim porezom - vezbanje
//    metodu koja vraca objekat sa najmanjim porezom - vezbanje
//    metodu koja racuna ukupan porez za ceo grad
//    metodu koja stampa sve objekte

    private String imeGrada;
    private ArrayList<Objekat> nizObjekata = new ArrayList<>();

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public String getImeGrada() {
        return imeGrada;
    }

    public void setImeGrada(String imeGrada) {
        this.imeGrada = imeGrada;
    }

    public ArrayList<Objekat> getNizObjekata() {
        return nizObjekata;
    }

    public void setNizObjekata(ArrayList<Objekat> nizObjekata) {
        this.nizObjekata = nizObjekata;
    }

    public double porezZaCeoGrad(){
        int suma = 0;
        for (int i = 0; i < nizObjekata.size(); i++) {
            suma += nizObjekata.get(i).porezObjekta();
        }return suma;
    }
    public void stampajObjekte(){
        for (int i = 0; i < nizObjekata.size(); i++) {
            System.out.println(nizObjekata.get(i));
        }
    }
    public void dodajObjekat(Objekat objekat){
        nizObjekata.add(objekat);
    }


}
