package p_02_06_2022_Plejer;

public class AudioControl extends Control {
////    Kreirati klasu AudioControl koja nasledjuje klasu Control i
////    gettere, settere i konstruktore
////    ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
////    implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100

    private boolean pojacaj;

    public boolean isPojacaj() {
        return pojacaj;
    }

    public void setPojacaj(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }

    public AudioControl(boolean pojacaj) {
        this.pojacaj = pojacaj;
    }
    @Override
    public void izvrsiAkciju(VideoPlejer videoPlejer){
        if (pojacaj){
            if (videoPlejer.getJacinaZvuka() + 1 > 100){
                videoPlejer.setJacinaZvuka(100);
            }else {
                videoPlejer.setJacinaZvuka(videoPlejer.getJacinaZvuka() + 1);
            }
        }else {
            if (videoPlejer.getJacinaZvuka() - 1 < 0){
                videoPlejer.setJacinaZvuka(0);
            }else {
                videoPlejer.setJacinaZvuka(videoPlejer.getJacinaZvuka() - 1);
            }
        }
    }
}



