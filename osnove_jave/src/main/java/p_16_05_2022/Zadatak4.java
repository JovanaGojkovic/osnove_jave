package p_16_05_2022;

public class Zadatak4 {
    public static void main(String[] args) {

//        4. Napisati funkciju koja stampa zbir, razliku,
//        proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni
//        parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa
//        razlicitim prosledjenim vrednostima.

        metodaMatematika(12, 3);
    }
    static void metodaMatematika (int x, int y){
        System.out.println("Zbir je: " + (x+y));
        System.out.println("Razlika je: " + (x-y));
        System.out.println("Proizvod je: " + (x*y));;
        System.out.println("Kolicnik je: " + (x/y));
    }
}
