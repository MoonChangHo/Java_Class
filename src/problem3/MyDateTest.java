package problem3;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1=new MyDate(30,12,2021);
        System.out.println(date1.isValid());
        System.out.println("---------------------------");
        MyDate date2=new MyDate(31,11,2021);
        System.out.println(date2.isValid());
        System.out.println("---------------------------");
        MyDate date3=new MyDate(29,2,2020);
        System.out.println(date3.isValid());
        System.out.println("---------------------------");
        MyDate date4=new MyDate(29,2,2019);
        System.out.println(date4.isValid());
        System.out.println("---------------------------");
    }

}
