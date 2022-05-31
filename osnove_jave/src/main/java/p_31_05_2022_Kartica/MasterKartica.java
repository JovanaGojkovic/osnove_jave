package p_31_05_2022_Kartica;

public class MasterKartica extends PlatnaKartica{
//    Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//    konstruktor sa parametrima
//    implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//    metoda naplatiOdrzavanje, koja sa racuna skida $2.
//    implementira metodu koja stampa podatke o kartici u formatu:
//    Master Card: 12/2019, 4012-1239-1221-3381, $232


    public MasterKartica(int suma, String brojKartice, String godinaIsteka, String mesecIsteka) {
        super(suma, brojKartice, godinaIsteka, mesecIsteka);
    }
    @Override
    public void izvrsiTransakciju(int unetaVrednost){
        suma = suma + 1000 / 15;
    }
    public void naplatiOdrzavanje(){
        suma = suma - 2;
    }
    @Override
    public void stampaj(){
        System.out.println("Master card: " + this.brojKartice + " , " + this.mesecIsteka + "/" + this.godinaIsteka
                + ", " + "$" + this.suma);

    }
}
