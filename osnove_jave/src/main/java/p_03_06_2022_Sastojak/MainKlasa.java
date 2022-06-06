package p_03_06_2022_Sastojak;

import java.util.ArrayList;

public class MainKlasa {
    public static void main(String[] args) {
//        U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice.
//            Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

        ArrayList<Proizvod>nizProizvoda = new ArrayList<>();
        Proizvod p1 = new IcePoint("Cokolada", true);
        Proizvod p2 = new IcePoint("Vanila", false);
        Proizvod p3 = new IcePoint("Jagoda", true);

        Proizvod p4 = new Pica(150);
        Proizvod p5 =new Pica(200);

        Sastojak s1 = new Sastojak("Mrvice", 150);
        p1.ubaciSastojak(s1);
        p1.cenaSvihSastojaka();

        p1.stampaj();
    }
}
