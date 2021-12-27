package cooperation;

import java.sql.SQLOutput;

public class Student {
    private String name;
    private int age;
    private int money;

    public Student(String name,int age,int money){
        this.name=name;
        this.age=age;
        this.money=money;
    }

    public void useSubway(Subway subway){
        subway.take(1000);
        this.money-=1000;
        System.out.println("지하철을 이용합니다. 차감된 돈: 1000");
    }
    public void useBus(Bus bus){
        bus.take(1200);
        this.money-=1200;
        System.out.println("버스를 이용합니다. 차감된 돈: 1200");
    }
    public void showInfo(){
        System.out.println(name+"님의 돈 : "+money);
    }

}
