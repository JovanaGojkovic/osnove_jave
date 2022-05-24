package p_23_05_2022;

public class Reziser {
//    Kreirati klasu Reziser koja ima:
//    ime i prezime rezisera
//    startost
//    konstruktore, gettere i settere koji su potrebni
//    metodu print koja stampa podatke u formatu
//    ime prezime, starost.god

    private String reziser;
    private int godisteRezisera;

    public String getReziser() {
        return this.reziser;
    }

    public int getGodisteRezisera() {
        return this.godisteRezisera;
    }

    public void setGodisteRezisera(int godisteRezisera) {
        this.godisteRezisera = godisteRezisera;
    }

    public void setReziser(String reziser) {
        this.reziser = reziser;
    }

    public void stampaj(){
        System.out.println(this.reziser + " " + this.godisteRezisera);
    }
}
