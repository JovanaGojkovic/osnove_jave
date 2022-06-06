package p_03_06_2022_Atleticar;

import java.util.ArrayList;

public class Disciplina {
//    Kreirati i klasu Disciplina čiji su privatni atributi:
//    ime discipline
//    tip discipline (Trkacka ili Skakacka)
//    niz atletičara koji učestvuju u toj disciplini.
//    U javnom delu klase definisati:
//    konstuktore, gettere i settere
//    konstruktor koji postavlja ime discipline i tip
//    metodu dodaj atleticara u disciplinu
//    metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//            (za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//            (za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.

    private String imeDiscipline;
    private String tip;
    private ArrayList<Atleticar> nizAtleticara = new ArrayList<>();

    public Disciplina(String imeDiscipline, String tip) {
        this.imeDiscipline = imeDiscipline;
        this.tip = tip;
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList<Atleticar> getNizAtleticara() {
        return nizAtleticara;
    }

    public void setNizAtleticara(ArrayList<Atleticar> nizAtleticara) {
        this.nizAtleticara = nizAtleticara;
    }

    public void dodajAtleticara(Atleticar atleticar) {
        nizAtleticara.add(atleticar);
    }

    public void diskvalifikuj(String imeIprezime) {
        for (int i = 0; i < nizAtleticara.size(); i++) {
            if (nizAtleticara.get(i).equals(imeIprezime))
                nizAtleticara.remove(i);
        }
    }
}
