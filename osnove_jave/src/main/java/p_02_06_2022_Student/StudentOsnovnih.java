package p_02_06_2022_Student;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih(String imeIprezime, int brojIndexa, int godinaStudija) {
        super(imeIprezime, brojIndexa, godinaStudija);
    }

//    Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 90000
//    za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//    stampajte podatke po izboru

    @Override
    public int cenaSkolarine(){
      return 9000;
    }
    @Override
    public boolean daLiJeNaBudzetu(){
        return godinaStudija < 5;
    }

}
