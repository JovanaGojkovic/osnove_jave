package p__30_05_2022;

public class TableMain {
    public static void main(String[] args) {
        //U mainu kreirati jednu tabelu sa 3x3 (3 kolone i 3 reda) i odstampajte je obicno i u html-u.
        TableHeader tabelaHeader = new TableHeader();
        tabelaHeader.addHeaderCell("Ime");
        tabelaHeader.addHeaderCell("Prezime");
        tabelaHeader.addHeaderCell("Godina rodjenja");

        Table tabela1 = new Table();
        tabela1.setHeaderTabele(tabelaHeader);

        TableRow red1 = new TableRow();
        red1.addRowCell("Jovana");
        red1.addRowCell("Gojkovic");
        red1.addRowCell("1986");
        tabela1.dodajNoviRed(red1);

        TableRow red2 = new TableRow();
        red2.addRowCell("Dragan");
        red2.addRowCell("Gojkovic");
        red2.addRowCell("1984");
        tabela1.dodajNoviRed(red2);

        TableRow red3 = new TableRow();
        red3.addRowCell("Lila");
        red3.addRowCell("Gojkovic");
        red3.addRowCell("2012");
        tabela1.dodajNoviRed(red3);

        tabela1.stampaj();
        tabela1.stampajHtml();

    }
}
