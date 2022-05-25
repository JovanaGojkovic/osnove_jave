package p_24_05_2022;

public class ZoomCall {
//    Kreirati klasu ZoomCall koja ima:
//    link za poziv
//    password
//    korisnika koji je host
//    korisnika koji je guest
//    gettere za sve atribute
//    setter samo za guest-a
//    metodu pokreni poziv koja stampa podatke u formatu:
//    Zoom Call: url
//    Password: password
//    Host: ime i prezime
//    Guest: ime i prezime
//    Maksimalno trajanje poziva je (broj minuta)min
//    Maksimalno trajanje poziva se cita od korisnika koji je host!
//    U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija

    private String linkZaPoziv;
    private String pass;
    private ZoomKorisnik host;
    private ZoomKorisnik guest;

    public ZoomCall(String linkZaPoziv, String pass, ZoomKorisnik host) {
        this.linkZaPoziv = linkZaPoziv;
        this.pass = pass;
        this.host = host;
    }

    public void setGuest(ZoomKorisnik guest) {
        this.guest = guest;

    }

    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }

    public void setLinkZaPoziv(String linkZaPoziv) {
        this.linkZaPoziv = linkZaPoziv;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ZoomKorisnik getHost() {
        return host;
    }

    public void setHost(ZoomKorisnik host) {
        this.host = host;
    }
    public void pokreniPoziv(){
        System.out.println("Zoom call: " + this.linkZaPoziv);
        System.out.println("Password: " + this.pass);
        System.out.println("Host: " + getHost().getPunoIme());
        System.out.println("Guest: " + this.guest.getPunoIme());
        System.out.println("Maximalno trajanje je: " + getHost().maxDuzina());
    }


//    Maksimalno trajanje poziva je (broj minuta)min
//    Maksimalno trajanje poziva se cita od korisnika koji je host!
//    U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija
}
