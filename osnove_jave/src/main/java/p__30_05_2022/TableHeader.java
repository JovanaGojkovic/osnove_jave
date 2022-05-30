package p__30_05_2022;

import java.util.ArrayList;

public class TableHeader {
//    Kreirati klasu TableHeader koja ima:
//    niz celija u headeru tabele. Niz je niz stringova
//    metodu addHeaderCell, koja dodaje polje u niz
//    metodu za stampu koja stampa celije kao u primeru:
//    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
//            (Objasnjenje \t je specijalan karakter tab koji ce da sluzi da lakse poravnate kolone)
//    metodu printHTML, koja sluzi da stampa header u HTML formatu.
//    header se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <th></th>
//    primer:
//<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>

    private ArrayList<String> nizCelija = new ArrayList<String>();

    public void addHeaderCell(String celija) {
        nizCelija.add(celija);
    }

    public void stampaj() {
        for (int i = 0; i < nizCelija.size(); i++) {
            if (i > 0) {
                System.out.print("\t\t"+ this.nizCelija.get(i) + "\t\t|");
            }else{
                System.out.print(this.nizCelija.get(i) + "\t\t|");
            }
        }
        System.out.println();
    }
    public void stampajHTML(){
        System.out.print("<tr>");
        for (int i = 0; i < nizCelija.size(); i++) {
            System.out.print("<th>" + this.nizCelija.get(i) + "</th>");
        }
        System.out.print("</tr>");
    }
}
