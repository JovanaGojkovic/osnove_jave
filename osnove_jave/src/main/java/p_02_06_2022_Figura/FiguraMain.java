package p_02_06_2022_Figura;

import java.util.ArrayList;

public class FiguraMain {
    public static void main(String[] args) {
//        U glavnoj klasi kreirati niz od 5 figura
//            (2 trougla, 3 pravougaonika) zatim sabrati sve
//        povrsine i obime i za svaku figuru ispisati ponaosob

        ArrayList<Figura>nizFigura = new ArrayList<>();
        Figura figura1 = new JednakostranicniTrougao(5);
        Figura figura2 = new JednakostranicniTrougao(6);
        Figura figura3 = new JednakostranicniTrougao(7);
        Figura figura4 = new Pravougaonik(5,9);
        Figura figura5 = new Pravougaonik(2,4);

        nizFigura.add(figura1);
        nizFigura.add(figura2);
        nizFigura.add(figura3);
        nizFigura.add(figura4);
        nizFigura.add(figura5);

        for (int i = 0; i <nizFigura.size() ; i++) {
            nizFigura.get(i).stampaj();
        }
        int suma = 0;
        for (int i = 0; i <nizFigura.size() ; i++) {
            suma += nizFigura.get(i).obim();
        }
        System.out.println(suma);

        for (int i = 0; i <nizFigura.size() ; i++) {
            suma += nizFigura.get(i).povrsina();
        }
        System.out.println(suma);

    }
}
