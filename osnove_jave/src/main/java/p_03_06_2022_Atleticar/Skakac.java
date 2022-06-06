package p_03_06_2022_Atleticar;

public class Skakac extends Atleticar{

//    Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar.
//    Kod trkača je bolji manji rezultat, a kod skakača veći.

    @Override
    public boolean boljiJe(Atleticar atleticar) {
        if (this.getRezultat() > atleticar.getRezultat()){
            return true;
        }
        return false;
    }

    public Skakac(String imeIprezime, double rezultat) {
        super(imeIprezime, rezultat);
    }

}
