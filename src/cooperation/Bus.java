package cooperation;

public class Bus {
    int busNumber;
    int count=0;
    int income=0;

    public Bus(int busNumber){
        this.busNumber=busNumber;
    }
    public void take(int money){        //승차
        this.income=money;
        count++;
    }
    public void showBusInfo(){
        System.out.println(busNumber+"번 버스의 승객:"+count+"명 , 수입 : "+income);
    }
}
