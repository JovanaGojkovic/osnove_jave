package p_02_06_2022_Plejer;

public class TimeControl extends Control {
//    Kreirati klasu TimeControl koja nasledjuje klasu Control i
//    konstruktore
//    ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//    implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili
//    unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa

    public boolean isUnapred() {
        return unapred;
    }

    public void setUnapred(boolean unapred) {
        this.unapred = unapred;
    }

    public TimeControl(boolean unapred) {
        this.unapred = unapred;
    }

    private boolean unapred;

    @Override
    public void izvrsiAkciju(VideoPlejer videoPlejer) {
        if (unapred){
            if (videoPlejer.getTrenutnoVreme() + 15 > videoPlejer.getDuzinaVidea()){
                videoPlejer.setTrenutnoVreme(videoPlejer.getDuzinaVidea());
            }else {
                videoPlejer.setTrenutnoVreme(videoPlejer.getTrenutnoVreme() + 15);
            }
        }else {
            if (videoPlejer.getTrenutnoVreme() - 15 < 0) {
                videoPlejer.setTrenutnoVreme(0);
            } else {
                videoPlejer.setTrenutnoVreme(videoPlejer.getTrenutnoVreme() - 15);
            }
        }
    }
}
