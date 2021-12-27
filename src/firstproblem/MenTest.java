package firstproblem;

public class MenTest {
    public static void main(String[] args) {
        Men person=new Men();
        person.age=17;
        person.countSon=3;
        person.isMarried=true;
        person.name="James";

        System.out.println("이름:"+person.name);
        System.out.println("자녀수:"+person.countSon);
    }
}
