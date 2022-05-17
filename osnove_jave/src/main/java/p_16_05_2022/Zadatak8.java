package p_16_05_2022;

public class Zadatak8 {
    public static void main(String[] args) {
//        8. Zadatak
//        Napisati metodu koja proverava da li je
//        trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla.
//         Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//       Trougao je pravougli ukoliko je a*a+b*b=c*c

        //daLiJePravougli(4,4,4);
        System.out.println(daLiJePravougli(4,4,4));
    }
    static boolean daLiJePravougli(int a, int b, int c){
        if (a*a+b*b==c*c){
            return true;
        }else {
            return false;
        }
    }
}
