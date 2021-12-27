package secondproblem;

public class OrderTest {
    public static void main(String[] args) {
        Order orderer = new Order();       //default생성자
        orderer.orderNumber=201907210001L;
        orderer.orderName="홍길순";
        orderer.orderProductNumber="PD-12";
        orderer.orderDate="2018-11-11";
        orderer.address="서울시 송파구";
        orderer.orderID="abc123";

        System.out.println("주문번호 : "+orderer.orderNumber );
        System.out.println("주문자 아이디 : "+orderer.orderID );
        System.out.println("주문 날짜 : "+orderer.orderDate );
        System.out.println("주문 이름 : "+orderer.orderName );
        System.out.println("주문 상품 번호 : "+orderer.orderProductNumber );
        System.out.println("배송 주소 : "+orderer.address);

    }
}
