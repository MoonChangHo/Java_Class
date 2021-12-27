package thisex;

public class Person {
    String name;
    int age;

    public Person(){
        // age=13; => 불가능
        this("없음",0);
        // this.name="없음";
        // this.age=0;
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void showInfo(){
        System.out.println("이름: "+name+" , 나이: "+age);
    }
}
