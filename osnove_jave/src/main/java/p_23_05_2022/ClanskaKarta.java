package p_23_05_2022;

public class ClanskaKarta {
//    Kreirati klasu ClanskaKarta koja ima:
//    popust (u rasponu od 5 do 10 %)
//    broj kartice (npr: 9329-0239)
//    gettere i setter
//            konstuktore
    private double popust;
    private String brojKartice;

    public ClanskaKarta(double popust, String brojKartice){
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
}
