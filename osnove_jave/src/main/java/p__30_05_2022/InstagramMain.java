package p__30_05_2022;

public class InstagramMain {
    public static void main(String[] args) {
        InstagramPost post1 = new InstagramPost("Prelepo je sve!");
        InstagramImage slika1 = new InstagramImage();
        slika1.setPutanjaDoSlike("instagram.com/korsnik-pera/profilna.jpg");

        InstagramUser user1 = new InstagramUser("Joxi", "potic.jovana@gmail.com", "Jovana Gojkovic");
        InstagramUser user2 = new InstagramUser("Perica", "pera.peric@gmail.com", "Pera Peric");

        InstagramTag tag1 = new InstagramTag(5,10, user1);
        InstagramTag tag2 = new InstagramTag(6, 11, user2);

        slika1.dodajTag(tag1);
        slika1.dodajTag(tag2);

        post1.dodajSliku(slika1);

        post1.stampaj();

    }
}
