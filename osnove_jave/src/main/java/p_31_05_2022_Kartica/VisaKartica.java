package p_31_05_2022_Kartica;

public class VisaKartica extends PlatnaKartica{
//    Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//    ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//    getter i setter za ovlasceno lice
//    konstruktor sa parametrima
//    implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume.
//    Najmanja provizija moze biti $4.
//    implementira metodu koja stampa podatke o kartici u formatu:
//    Visa Card: 4012-1239-1221-3381, 11/2019, $212
    private String ovlascenaOsoba;

    public VisaKartica(int suma, String brojKartice, String godinaIsteka, String mesecIsteka, String ovlascenaOsoba) {
        super(suma, brojKartice, godinaIsteka, mesecIsteka);
        this.ovlascenaOsoba = ovlascenaOsoba;
    }

    public String getOvlascenaOsoba() {
        return ovlascenaOsoba;
    }

    public void setOvlascenaOsoba(String ovlascenaOsoba) {
        this.ovlascenaOsoba = ovlascenaOsoba;
    }
    @Override
    public void izvrsiTransakciju(int unetaVrednost){
        suma = suma + 1000 / 18;
    }
    @Override
    public void stampaj(){
        System.out.println("Visa kartica: " + this.brojKartice + " , " + this.mesecIsteka + "/" + this.godinaIsteka
                + ", " + "$" + this.suma);

    }
}
