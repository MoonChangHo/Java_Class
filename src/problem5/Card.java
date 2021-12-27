package problem5;

public class Card {
    private static int number=1000;
    private int cardNumber;
    public Card(){
        cardNumber=number++;
    }
    public void getCardNumber(){
        System.out.println("카드 번호:"+cardNumber);
    }
}
