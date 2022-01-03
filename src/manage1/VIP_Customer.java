package manage1;
//하위클래스
public class VIP_Customer extends Customer {

    double saleRatio;
    private int agentID;
    public VIP_Customer(){
        // super(); : 상위클래스의 메모리위치를 가지고 있음
        System.out.println("하위클래스 생성자 호출");
        customerGrade="VIP";
        bonusRatio=0.05;
        saleRatio=0.1;
    }
    /* 오버라이딩을 나타내는 두가지 방법; 1.타이핑 2.generate->override
    public int calcPrice(int price){        //오버라이딩 (상위클래스의 함수를 재정의)
        bonusPoint+=price*bonusRatio;
        return price;
    }
     */
    @Override   //Annotation(이 메소드는 오버라이딩 된 메소드이다).
    public int calcPrice(int price) {
        bonusPoint+=price*bonusRatio;
        return price-(int)(price*saleRatio);
    }
}
