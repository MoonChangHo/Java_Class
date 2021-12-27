package problem3;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid=true;

    public MyDate(int day, int month,int year){
        setMonth(month);
        setYear(year);
        setDay(day);

    }

    public String isValid(){
        if (isValid){
            System.out.println("!"+year+"년 "+month+"월 "+day+"일!");
            return "유효한 날짜입니다.";
        }
        else {
            System.out.println("!"+year+"년 "+month+"월 "+day+"일!");
            return "유효하지 않은 날짜입니다.";
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 0 || day > 31) {
                    isValid = false;
                    this.day = day;
                }
                else {
                    this.day = day;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 0 || day > 30) {
                    isValid = false;
                    this.day = day;
                }
                else
                    this.day = day;
                break;
            case 2:
                if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
                    if (day < 0 || day > 29) {
                        isValid = false;
                        this.day = day;
                    }
                    else
                        this.day = day;
                }
                else {
                    if (day < 0 || day > 28) {
                        isValid = false;
                        this.day = day;
                    }
                    else
                        this.day = day;
                }
                break;
            default:
                isValid = false;
                break;
        }
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month<1||month>12){
            isValid=false;
        }
        else
            this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
