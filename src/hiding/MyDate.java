package hiding;
//정보은닉
public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
        return  day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ( month<1 || month>12 ){

        }
        else {
            isValid=true;
            this.month = month;
        }
    }

    public void show(){
        if (isValid) {
            System.out.println("일: " + day + "월:" + month + "년" + year);
        }
        else
            System.out.println("유효하지 않다.");
    }

}
