package p_03_06_2022_Sastojak;

import java.util.ArrayList;

public class Kasa {
//    Kreirati klasu Kasa koja ima:
//    niz svih dostupnih dodataka sa cenama.
//    niz proizvoda
//    metodu dodaj proizvod
//    Difoltni konstuktor u kom se u niz dodaju 10 razlicitih sastojaka u niz
//    Npr: luk, piletina, junetina, prsuta, jaja, cokolada, …
//    metodu koja trazi dodatak iz niza prema prosledjenom nazivu sastojka.
//    Metoda vraca dodatak (objekat tipa Dodatak)
//    metodu sracunajCenuPorudzbine, koja racuna i vraca sumu svih proizvoda
//    metodu setampajRacun, metoda stampa sve proizvode i ukupan racun

    private ArrayList<Sastojak> nizSastojaka = new ArrayList<>();
    private ArrayList<Proizvod> nizProizvoda = new ArrayList<>();

    public void dodajProizvod(Proizvod proizvod) {
        nizProizvoda.add(proizvod);
    }

    public Kasa(ArrayList<Sastojak> nizSastojaka) {
        this.nizSastojaka = nizSastojaka;
    }
//    public int traziDodatak(Sastojak sastojak){
//        for (int i = 0; i < nizSastojaka.size(); i++) {
//            if (sastojak.getNaziv().equals(nizSastojaka.get(i).getNaziv())){
//            }
//        }
//    }


}
//    metodu koja trazi dodatak iz niza prema prosledjenom nazivu sastojka.
//    Metoda vraca dodatak (objekat tipa Dodatak)
//    metodu sracunajCenuPorudzbine, koja racuna i vraca sumu svih proizvoda
//    metodu setampajRacun, metoda stampa sve proizvode i ukupan racun



