package p_03_06_2022_Atleticar;

public class AtlMain {
    public static void main(String[] args) {
//        U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa
//        proizvoljnim brojem učesnika, učitati podatke o učesnicima obe discipline sa tastature i
//        (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

        Disciplina skokUdalj = new Disciplina("Skok u dalj", "Skakacka");
        Disciplina stoMsaPreponama = new Disciplina("100m sa preponama", "Trkacka");

       Trkac trkac1 = new Trkac("Pera Peric", 8);
       Trkac trkac2 = new Trkac("Mika Mikic", 9);

       Skakac skakac1 = new Skakac("Laza Lazic", 10);
       Skakac skakac2 = new Skakac("Mita Mitic",20);

       trkac1.boljiJe(trkac1);
       trkac1.stampaj();

       skakac1.boljiJe(skakac2);
       skakac1.stampaj();



    }
}
