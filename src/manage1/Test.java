package manage1;

public class Test {
    public static void main(String[] args) {

        Customer Lee=new Customer();
        Lee.setCustomerName("이순신");
        Lee.setCustomerID(20010);
        Lee.bonusPoint=1000;
        System.out.println(Lee.showCustomerInfo());
        int LeePr=Lee.calcPrice(10000);
        System.out.println("Lee의 지불금액:"+LeePr);

        VIP_Customer Kim=new VIP_Customer();
        Kim.setCustomerID(20020);
        Kim.setCustomerName("김유신");
        Kim.bonusPoint=1000;
        System.out.println(Kim.showCustomerInfo());
        int Kimpr=Kim.calcPrice(10000);
        System.out.println("Kim의 지불금액:"+Kimpr);

        Customer Moon=new VIP_Customer();       //VIP인스턴스 메소드 동일
        Moon.setCustomerID(20020);
        Moon.setCustomerName("무운운");
        Moon.bonusPoint=1000;
        System.out.println(Moon.showCustomerInfo());
        int Moonpr=Kim.calcPrice(10000);
        System.out.println("Moon의 지불금액:"+Moonpr);

    }
}
