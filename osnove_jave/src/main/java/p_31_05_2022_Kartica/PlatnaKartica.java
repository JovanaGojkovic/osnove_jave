package p_31_05_2022_Kartica;

public class PlatnaKartica {
//    Napraviti klasu PlatnaKartica koja ima
//    atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//    atribut broj kartice  primer: 4012-1239-1221-3381
//    atribut godina - godina do kada vazi kartica
//    atribut mesec-  mesec do kada vazi kartica
//    konstruktor sa parametrima
//    gettere za sve atribute, bez settera
//    metodu dodajSredstva koja povecava sumu za unetu vrednost
//    metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//    metodu koja stampa podatke o kartici u formatu:
//            4012-1239-1221-3381, 11/2019, $212
    protected int suma;
    protected String brojKartice;
    protected String godinaIsteka;
    protected String mesecIsteka;

    public PlatnaKartica(int suma, String brojKartice, String godinaIsteka, String mesecIsteka) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaIsteka = godinaIsteka;
        this.mesecIsteka = mesecIsteka;
    }

    public int getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public String getGodinaIsteka() {
        return godinaIsteka;
    }

    public String getMesecIsteka() {
        return mesecIsteka;
    }
    public void dodajSredstva(int unetaVrednost){
        this.suma += unetaVrednost;
    }
    public void izvrsiTransakciju(int unetaVrednost){
        if (this.suma - unetaVrednost <= 0){
            System.out.println("Nemate sredstava za transakciju");
        }else {
            this.suma = this.suma - unetaVrednost;
        }
    }
    public void stampaj(){
        System.out.println("Broj kartice: " + this.brojKartice + " , " + this.mesecIsteka + "/" + this.godinaIsteka
                            + ", " + "$" + this.suma);
    }
}
