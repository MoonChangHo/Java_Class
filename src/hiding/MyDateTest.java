package hiding;

import hiding.MyDate;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate=new MyDate();
        myDate.setYear(2021);
        myDate.setDay(30);
        myDate.setMonth(3);

        myDate.show();

        MyDate myDate2=new MyDate();
        myDate2.setDay(30);
        myDate2.setMonth(13);
        myDate2.setYear(2017);

        myDate2.show();
    }
}
