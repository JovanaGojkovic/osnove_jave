package p_02_06_2022_Student;

public class StudentMaster extends Student {
    public StudentMaster(String imeIprezime, int brojIndexa, int godinaStudija) {
        super(imeIprezime, brojIndexa, godinaStudija);
    }

    //    Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 100000
//    za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
    @Override
    public int cenaSkolarine() {
        return 100000;
    }
    @Override
    public boolean daLiJeNaBudzetu(){
        return godinaStudija < 2;
    }

}
