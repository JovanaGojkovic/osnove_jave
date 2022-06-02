package p_02_06_2022_Student;

public class StudentMain {
    public static void main(String[] args) {

        StudentOsnovnih osnovni = new StudentOsnovnih("Pera Peric", 123, 4);
        StudentMaster mister = new StudentMaster("Jovana Gojkovic", 875, 5);

        osnovni.stampaj();
        mister.stampaj();
    }
}
