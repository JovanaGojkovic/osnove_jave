package p_31_05_2022;

public class MainOsoba {
    public static void main(String[] args) {
       // U glavnom programu kreirati 2 studenta i 2 profesora.

        Student prvi = new Student("Jovana Gojkovic", "123456", 21, 1500);
        Student drugi = new Student("Pera Peric", "654123", 32, 6520);

        Profesor matematicar = new Profesor("Milan Jovanovic", "5478965", "Matematika", 50000);
        Profesor java = new Profesor("Vladimir Minic", "9855521", "java", 60000);


        prvi.setDugZaSkolarinu(250);
        prvi.uplatiSkolarinu(500);
        prvi.stampaj();

        drugi.stampaj();

        matematicar.stampaj();
        java.stampaj();
    }
}
