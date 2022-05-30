package p__30_05_2022;

import java.util.ArrayList;

public class TableRow {
//    Kreirati klasu TableRow koja ima:
//    niz celija u telu tabele. Niz je niz stringova
//    metodu addRowCell, koja dodaje polje u niz
//    metodu za stampu koja stampa celije kao u primeru:
//    celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
//    metodu printHTML, koja sluzi da stampa red u HTML formatu.
//    red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
//    primer:
//<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>

    private ArrayList<String> nizCelija = new ArrayList<String>();
    public void addRowCell(String polje){
        nizCelija.add(polje);
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
            System.out.print("<td>" + this.nizCelija.get(i) + "</td>");
        }
        System.out.print("</tr>");
    }
}
