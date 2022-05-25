package p_24_05_2022;

public class ZoomKorisnik {
//    ime i prezime
//    tip licence (basic/pro/premium)
//    konstruktore. Po difoltu korisnik ima basic licencu.
//    gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//    metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//    ako je uplata 100, postavlja licencu na “pro”
//    ako je uplata 150, postavlja licencu na “premium”
//    Metoda kao parametar prima vrednost uplate $100 ili $150
//    metodu ponisti pretplatu koja postavlja licencu na basic
//    metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//    ako je basic, vraca 40min
//    ako je pro, vraca 240min
//    ako je  premium, vraca 1440min
//    metodu za stampu koja stampa u formatu:
//    ime i prezime

    private String punoIme;
    private String licenca;

    public ZoomKorisnik(String punoIme) {
        this.punoIme = punoIme;
        this.licenca = "basic";
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getLicenca() {
        return licenca;
    }
    public void pretplatiSe(int uplata){
        if (uplata == 100){
             licenca = "pro";
        }else{
            uplata = 150;
             licenca = "premium";
        }
    }
    public void ponistiMetodu(){
        licenca = "basic";
    }
    public int maxDuzina(){
        if (licenca.equals("basic")){
            return 40;
        }else if (licenca.equals("pro")) {

            return 240;

        } return 1440;
    }
    public void stampaj(){
        System.out.println(this.punoIme);
    }



//    metodu za stampu koja stampa u formatu:
//    ime i prezime
}
