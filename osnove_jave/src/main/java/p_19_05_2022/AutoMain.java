package p_19_05_2022;

public class AutoMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.vozac = "Jovana Gojkovic";
        auto1.marka = "BMW";
        auto1.brojVrata = 5;
        auto1.potrosnja = 10;
        auto1.trenutnaBrzina = 150;
        auto1.stampaj();
        auto1.dodajGas();
        auto1.dodajGas();
        auto1.dodajGas();
        auto1.trenutnaPotrosnja();

        if (auto1.prekoracenjeBrzine(100)) {
            System.out.println("Kazna za prekoracenje je: " + auto1.visinaKazne(100));
        }
        System.out.println("Trenutna potrosnja je " + auto1.trenutnaPotrosnja());
    }
}
