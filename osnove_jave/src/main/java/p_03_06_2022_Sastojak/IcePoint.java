package p_03_06_2022_Sastojak;

public class IcePoint extends Proizvod{
//    Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//    tip sladoleda (vanila, cokolada)
//    atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//    override uje metodu koja ukupnu cenu racuna:
//    ako je mali ice point na cenu svih dodataka doda 100
//    ako je veliki ice point cenu svih dodataka doda 130
//    override uje metodu stampaj da stampa sve podatke

    private String tipSladoleda;
    private boolean velikiSladoled;

    public IcePoint(String tipSladoleda, boolean velikiSladoled) {
        this.tipSladoleda = tipSladoleda;
        this.velikiSladoled = velikiSladoled;
    }

    public String getTipSladoleda() {
        return tipSladoleda;
    }

    public void setTipSladoleda(String tipSladoleda) {
        this.tipSladoleda = tipSladoleda;
    }

    public boolean isVelikiSladoled() {
        return velikiSladoled;
    }

    public void setVelikiSladoled(boolean velikiSladoled) {
        this.velikiSladoled = velikiSladoled;
    }

    @Override
    public int racunajUkupnuCenu(){
        if (velikiSladoled){
            return cenaSvihSastojaka() + 130;
        }else {
            return cenaSvihSastojaka() + 100;
        }
    }

    @Override
    public void stampaj(){
        if (this.velikiSladoled) {
            System.out.println("Veliki sladoled " + this.tipSladoleda);
        }else {
            System.out.println("Mali sladoled " + this.tipSladoleda);
        }
    }


}
