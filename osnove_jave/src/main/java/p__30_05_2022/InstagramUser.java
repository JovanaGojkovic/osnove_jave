package p__30_05_2022;

public class InstagramUser {
//    Kreirati klasu InstagramUser koja ima:
//    username
//    Ime i prezime
//            email
//    Sve sto vam dalje zatreba dopunite klasu.
    private String instaUser;
    private String imeIprezime;
    private String email;

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public InstagramUser(String instaUser, String email, String imeIprezime) {
        this.instaUser = instaUser;
        this.email = email;
        this.imeIprezime = imeIprezime;
    }

    public String getInstaUser() {
        return instaUser;
    }

    public void setInstaUser(String instaUser) {
        this.instaUser = instaUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
