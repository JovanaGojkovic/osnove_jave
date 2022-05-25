package p_24_05_2022;

public class UgovorMain {
    public static void main(String[] args) {
        FizickoLice kupac = new FizickoLice("Jovana Gojkovic", 123456, "0708986735081", true);
        FizickoLice prodavac = new FizickoLice("Petar Petrovic", 52145, "251285697455", false);

        Ugovor zakljucenUgovor = new Ugovor("1.1.2022.", 50000, kupac, prodavac, "Somborska");

        zakljucenUgovor.stampaj();
    }
}
