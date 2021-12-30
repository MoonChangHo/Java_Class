package array;

public class Subject {
    private String subjectName;
    int score;
    public  Subject(String name,int score){
        this.score=score;
        this.subjectName=name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
