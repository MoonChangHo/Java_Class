package StudentManage;

public class StudentTest {
    public static void main(String[] args){
        Student Park=new Student("박진영");
        Park.setKoreaSubject("국어",100);
        Park.setMathSubject("수학",98);
        Park.showScore();

        Student Lee=new Student("이영석");
        Lee.setKoreaSubject("국어",97);
        Lee.setMathSubject("수학",99);
        Lee.showScore();

        /*
        Student studentMoon=new Student("문순신");
        studentMoon.address="서울";

        Student studentPark=new Student(100,"박순신");
        studentPark.address="서울";

        studentMoon.showStudentinfo();
        studentPark.showStudentinfo();
        */


    }
}
