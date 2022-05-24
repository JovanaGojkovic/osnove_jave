package p_23_05_2022;

public class FilmReziserMain {
    public static void main(String[] args) {

        Film prviFilm = new Film();

        prviFilm.setNazivFilma("Prohujalo sa vihorom");
        prviFilm.setGodinaIzdanja(2005);
        prviFilm.stampaj();

        Reziser prviReziser = new Reziser();
        prviReziser.setReziser("Petar Petrovic");
        prviReziser.setGodisteRezisera(1985);
        prviReziser.stampaj();
    }
}
