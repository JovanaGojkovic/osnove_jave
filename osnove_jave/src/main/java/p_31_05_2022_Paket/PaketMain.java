package p_31_05_2022_Paket;

public class PaketMain {
    public static void main(String[] args) {
        EONPaket prvi = new EONPaket("Paket1", "Petar Petrovic", 1200, 12,
                                    120, 70);
        DUOPaket drugi = new DUOPaket("Paket2", "Mika Mikic", 1500, 24,
                                300,100, "Mobilni telefon");

        prvi.stampaj();
        System.out.println("------------------------------------");
        drugi.stampaj();
    }
}
