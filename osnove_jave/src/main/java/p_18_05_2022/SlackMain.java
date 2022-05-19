package p_18_05_2022;

public class SlackMain {
    public static void main(String[] args) {
//        Krairti klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]

        Slack p = new Slack();
        p.ime = "Jovana";
        p.prezime = "Gojkovic";
        p.datum = "10.02.2022";
        p.vreme = "18:55";
        p.tekst = "Kada ce rezultati testa?";

        Slack b = new Slack();
        b.ime = "Milan";
        b.prezime = "Jovanovic";
        b.datum = "10.02.2022";
        b.vreme = "18:56";
        b.tekst = "Nikada!?";

        System.out.println(p.ime + " " + p.prezime + " "+ " "+ p.datum + " " + p.tekst);
        System.out.println(b.ime + " " + b.prezime + " " + b.datum + " "+ b.tekst);
    }
}
