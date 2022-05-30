package p__30_05_2022;

import java.util.ArrayList;

public class InstagramPost {
//    Kreirati klasu InstagramPost koja ima
//    niz slika
//    Opis koji moze da se postavi za post
//    metodu dodajSliku
    private ArrayList<InstagramImage> nizSlika = new ArrayList<InstagramImage>();
    private String opisPosta;

    public InstagramPost(String opisPosta) {
        this.opisPosta = opisPosta;
    }

    public String getOpisPosta() {
        return opisPosta;
    }

    public void setOpisPosta(String opisPosta) {
        this.opisPosta = opisPosta;
    }
    public void dodajSliku(InstagramImage slika){
        nizSlika.add(slika);
    }
    public void stampaj(){
        //System.out.println(this.opisPosta);
        for (int i = 0; i <this.nizSlika.size(); i++) {
            InstagramImage slika = this.nizSlika.get(i);
            System.out.println("Slika br: " + (i+1));
            System.out.println("Putanja do slike: " + slika.getPutanjaDoSlike());
            for (int j = 0; j < slika.getNizTagova().size(); j++) {
                InstagramTag tag = slika.getNizTagova().get(j);
                System.out.println("   Tagovani korisnik: " + tag.getInstagramUser().getInstaUser());
            }
            System.out.println("----");
        }
    }
}
