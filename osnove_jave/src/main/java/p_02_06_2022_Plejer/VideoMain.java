package p_02_06_2022_Plejer;

public class VideoMain {
    public static void main(String[] args) {
       // U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
        VideoPlejer plejer = new VideoPlejer(5.60, 3.20,24,1080);

        TimeControl akcija = new TimeControl(true);
        akcija.izvrsiAkciju(plejer);

        AudioControl akcija2 = new AudioControl(true);
        akcija2.izvrsiAkciju(plejer);

        QualityOptimizerControl op = new QualityOptimizerControl(20);
        op.izvrsiAkciju(plejer);

        plejer.stampaj();
    }
}
