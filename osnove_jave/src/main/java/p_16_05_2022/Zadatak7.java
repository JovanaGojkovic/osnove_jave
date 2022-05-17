package p_16_05_2022;

public class Zadatak7 {
    public static void main(String[] args) {
//        7.Zadatak
//        Napisati metodu koja vraca suprotno negativna broj od prosledjenog.
//                Metoda prima broj N i vraca ga sa negativnom vrednoscu.

        int negBroj = negBroj(5);
        System.out.println("Negativan broj je " + negBroj);
    }
    static int negBroj(int broj){
      int suprotanBroj = broj * -1;
      return suprotanBroj;
    }
}

