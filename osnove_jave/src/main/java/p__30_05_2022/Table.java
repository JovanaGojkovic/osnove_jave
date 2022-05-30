package p__30_05_2022;

import java.util.ArrayList;

public class Table {
    //    Kreirati klasu Table koja ima:
//    header tabele
//    niz redova. Niz je niz TableRow elementa
//    setter za header
//    metodu za dodvanje novog reda u tablu
//    metodu za stampu koja stampa header i redove tabele
//    metodu za stampu HTML-a tabele.Primer
//            <table>
//<thead>
//<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
//</thead>
//<tbody>
//<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
//<tr><td>Petar</td><td>Petrovic</td><td>29</td></td>
//<tr><td>Darko</td><td>Darkovic</td><td>30</td></td>
//</tbody>
//</table>
    private TableHeader headerTabele;
    private ArrayList<TableRow> nizRedova = new ArrayList<TableRow>();

    public void setHeaderTabele(TableHeader headerTabele) {
        this.headerTabele = headerTabele;
    }

    public void dodajNoviRed(TableRow noviRed) {
        nizRedova.add(noviRed);
    }

    public void stampaj() {
        this.headerTabele.stampaj();
        for (int i = 0; i < nizRedova.size(); i++) {
            TableRow trenutniRed = nizRedova.get(i);
            trenutniRed.stampaj();
        }
    }

    public void stampajHtml() {
        System.out.print("<table>");
        System.out.print("<thead>");
        this.headerTabele.stampajHTML();
        System.out.print("<thead>");
        System.out.print("<body>");
        for (int i = 0; i < nizRedova.size(); i++) {
            TableRow trenutniRed = nizRedova.get(i);
            trenutniRed.stampajHTML();
        }
        System.out.print("<body>");
        System.out.print("<table>");
    }
}

