package p__30_05_2022;

public class InstagramTag {
//    Kreiarti klasu InstagramTag koja ima:
//    x koordinatu na slici
//    y koordinatu na slici
//    usera koji je tagovan
    private int koordinataX;
    private int koordinataY;
    private InstagramUser instagramUser;

    public InstagramTag(int koordinataX, int koordinataY, InstagramUser instagramUser) {
        this.koordinataX = koordinataX;
        this.koordinataY = koordinataY;
        this.instagramUser = instagramUser;
    }

    public int getKoordinataX() {
        return koordinataX;
    }

    public void setKoordinataX(int koordinataX) {
        this.koordinataX = koordinataX;
    }

    public int getKoordinataY() {
        return koordinataY;
    }

    public void setKoordinataY(int koordinataY) {
        this.koordinataY = koordinataY;
    }

    public InstagramUser getInstagramUser() {
        return instagramUser;
    }

    public void setInstagramUser(InstagramUser instagramUser) {
        this.instagramUser = instagramUser;
    }
}
