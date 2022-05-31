package p_31_05_2022_Kartica;

public class MainKartica {
    public static void main(String[] args) {
        //u main funkciji, napraviti visa i master kartice i testirati funkcije
        VisaKartica vk = new VisaKartica(1000, "12345", "2022", "12", "pera peric");
        MasterKartica mk = new MasterKartica(5000, "986523", "2025", "10");

        vk.izvrsiTransakciju(500);
        vk.dodajSredstva(1000);
        vk.stampaj();

        mk.izvrsiTransakciju(120);
        mk.dodajSredstva(6000);
        mk.stampaj();
    }
}
