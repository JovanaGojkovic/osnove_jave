package p_02_06_2022_Kartica;

public abstract class PlatnaKartica {
    //    Napraviti klasu apstraktnu PlatnaKartica koja ima
//    atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//    atribut broj kartice  primer: 4012-1239-1221-3381
//    atribut godina - godina do kada vazi kartica
//    atribut mesec-  mesec do kada vazi kartica
//    konstruktor sa parametrima
//    gettere za sve atribute, bez settera
//    metodu dodajSredstva koja povecava sumu za unetu vrednost
//    apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//    apstraktnu metodu koja stampa podatke o kartici.
    protected int suma;
    protected String brojKartice;

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

    protected String godinaIsteka;
    protected String mesecIsteka;

    public PlatnaKartica(int suma, String brojKartice, String godinaIsteka, String mesecIsteka) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaIsteka = godinaIsteka;
        this.mesecIsteka = mesecIsteka;
    }

    public void dodajSredstva(int unetaVrednost) {
        this.suma += unetaVrednost;
    }

    public abstract void izvrsiTransakciju(int unetaVrednost);

    public abstract void stampaj();
}



