package StudentManage;

public class Student {
    public static int schoolNumber=1000;
    private int studentID;   //public클래스: public클래스는 하나이고, 자바 파일 이름은 동일해야 함.
    public String studentName;
    public String address;

    Subject korea=new Subject();
    Subject math=new Subject();

    public Student(String name){
        studentID=schoolNumber++;
        studentName=name;
    }
    public void setKoreaSubject(String name,int score){
        korea.subjectName=name;
        korea.subjectScore=score;
    }
    public void setMathSubject(String name,int score){
        math.subjectScore=score;
        math.subjectName=name;
    }
    public void showScore(){
        System.out.println("ID : "+studentID+"국어:"+korea.subjectScore+", 수학 : "+math.subjectScore);
    }



    //학생정보 출력
    public void showStudentinfo() {
        System.out.println(studentName + "," + address+","+studentID);
    }
}