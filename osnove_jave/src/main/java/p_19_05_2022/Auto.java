package p_19_05_2022;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnja;
    public double trenutnaBrzina;
    public String registracija;
    public boolean klimaOn = true;

    public void stampaj() {
        System.out.println("[" + this.vozac + "]");
        System.out.println("[" + this.marka + "]" + " - " + "[" + this.brojVrata + "]" + "-ro vrata");
        System.out.println("Sa potrosnjom od " + "[" + this.potrosnja + "]" + " na 100km");
        System.out.println("[" + this.trenutnaBrzina + "]" + " km/h je trenutna brzina");
    }

    public boolean prekoracenjeBrzine(double ogranicenje) {
        return this.trenutnaBrzina > ogranicenje;
    }

    public double visinaKazne(double ogranicenje) {
        if (this.prekoracenjeBrzine(ogranicenje)) {
            return (this.trenutnaBrzina - ogranicenje) * 1000;
        }
        return ogranicenje;
    }

    public void dodajGas() {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
    }

    public void koci() {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
        if (this.trenutnaBrzina < 0) {
            this.trenutnaBrzina = 0;
        }
    }

    public double trenutnaPotrosnja() {
        if (klimaOn) {
            return this.trenutnaBrzina() / 100.0 * this.potrosnja * 1.2;
        }
        return this.trenutnaBrzina / 100.0 * this.potrosnja * 1.0;
    }

    private double trenutnaBrzina() {
        return trenutnaBrzina;
    }

}



