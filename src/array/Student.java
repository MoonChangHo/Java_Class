package array;

import java.util.ArrayList;

public class Student {
    private int save=20180000;
    private int ID;
    public String studentName;
    ArrayList<Subject> subjectList;

    public Student(String name){
        ID=save++;
        studentName=name;
        subjectList=new ArrayList<Subject>();
    }

    public void addSubject(String subjectName,int score){
        Subject subject=new Subject(subjectName,score);
        subjectList.add(subject);
    }

}
