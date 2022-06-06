package p_03_06_2022_Objekat;

import java.util.ArrayList;

public class MainKlasa {
    public static void main(String[] args) {
//     U glavnom programu napraviti jednu poresku upravu i u nju dodati
//    minimum 3 razlicita objekta i istestirati sve metode.

        PoreskaUprava pu = new PoreskaUprava("Nis");
        Kuca k = new Kuca("AA",100,2,5);
        Zgrada z = new Zgrada("bbb", 900, 1, 50);
        Lokal l = new Lokal("ccc",25, 3);

        pu.dodajObjekat(k);
        pu.dodajObjekat(z);
        pu.dodajObjekat(l);

        k.stampaj();
        z.stampaj();
        l.stampaj();



    }
}
