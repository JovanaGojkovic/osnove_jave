package p_23_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        ClanskaKarta clanskaKarta = new ClanskaKarta(10, "123654");

        Kupac kupac = new Kupac("Pera Peric", clanskaKarta);

        Proizvod prvi = new Proizvod("Patike", kupac, 50);


        prvi.stampaj();
    }
}
