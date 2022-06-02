package p_02_06_2022_Plejer;

public class QualityOptimizerControl extends Control{
//    Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//    ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//    gettere, settere i konstruktore
//    implementira metodu izvrsi akciju tako sto postavlja kvalitet
//    videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//    brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//    npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//    npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//    npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
    private int brzinaNeta;

    public QualityOptimizerControl(int brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }

    public int getBrzinaNeta() {
        return brzinaNeta;
    }
    @Override
    public void izvrsiAkciju(VideoPlejer videoPlejer){
        if (brzinaNeta * 10.1 == 204){
            videoPlejer.setKvalitet(240);
        } else if (brzinaNeta * 10.1 == 50.5){
            videoPlejer.setKvalitet(144);
        } else if (brzinaNeta * 10.1 == 505) {
            videoPlejer.setKvalitet(720);
        }
    }
    public void setBrzinaNeta(int brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }
}
