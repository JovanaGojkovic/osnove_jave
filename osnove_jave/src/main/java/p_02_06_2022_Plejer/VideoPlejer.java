package p_02_06_2022_Plejer;

public class VideoPlejer {
//    Kreirati klasu VideoPlayer koja ima:
//    duzinu videa
//    trenutno vreme videa
//    jacinu zvuka
//    Kvalitet videa (144, 240, 360, 480, 720, 1080)
//    gettere, settere i konstruktore
//    metodu stampaj koja stampa podatke u formatu:
//    trenutno vreme videa
//    jacina zvuka
//    kavlitet videa

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }

    public VideoPlejer(double duzinaVidea, double trenutnoVreme, int jacinaZvuka, int kvalitet) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }

    private double duzinaVidea;
    private double trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitet;

    public void stampaj(){
        System.out.println("Trenutno vreme videa: " + this.trenutnoVreme);
        System.out.println("Jacina zvuka:" + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.kvalitet);
    }
}
