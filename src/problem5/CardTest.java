package problem5;

public class CardTest {
    public static void main(String[] args) {
        CardCompany woori=CardCompany.getInstance();
        Card my=woori.createCard();
        Card you=woori.createCard();

        my.getCardNumber();
        you.getCardNumber();

    }
}
