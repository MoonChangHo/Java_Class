package Problem6;

public class StudentTest {
    public static void main(String[] args) {

        Student Lee=new Student("Lee");
        Student Kim=new Student("Kim");
        Student Cho=new Student("Cho");

        Lee.readBook("세종대왕","문");
        Lee.readBook("세종대왕2","문");

        Kim.readBook("이순신1","김신");
        Kim.readBook("이순신2","김신");
        Kim.readBook("이순신3","김신");

        Cho.readBook("해리1","궁");
        Cho.readBook("해리2","궁");
        Cho.readBook("해리3","궁");
        Cho.readBook("해리4","궁");

        Lee.showStudentReadInfo();
        Kim.showStudentReadInfo();
        Cho.showStudentReadInfo();




    }
}
