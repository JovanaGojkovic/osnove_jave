package p__30_05_2022;

import java.util.ArrayList;

public class InstagramImage {
//    Kreirati klasu InstagramImage koja ima:
//    niz tagova
//    dimenziju slike
//    putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//    metodu dodajTag

   private ArrayList<InstagramTag> nizTagova = new ArrayList<InstagramTag>();
   private String dimenzijaSlke;
   private String putanjaDoSlike;

    public InstagramImage(){
    }

    public ArrayList<InstagramTag> getNizTagova() {
        return nizTagova;
    }

    public void setNizTagova(ArrayList<InstagramTag> nizTagova) {
        this.nizTagova = nizTagova;
    }

    public String getDimenzijaSlke() {
        return dimenzijaSlke;
    }

    public void setDimenzijaSlke(String dimenzijaSlke) {
        this.dimenzijaSlke = dimenzijaSlke;
    }

    public String getPutanjaDoSlike() {
        return putanjaDoSlike;
    }

    public void setPutanjaDoSlike(String putanjaDoSlike) {
        this.putanjaDoSlike = putanjaDoSlike;
    }
    public void dodajTag(InstagramTag instagramTag){
        nizTagova.add(instagramTag);
    }
}
