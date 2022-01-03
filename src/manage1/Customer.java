package manage1;
//상위 클래스
public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;
    public Customer(){
        System.out.println("상위클래스 생성자 호출");
        customerGrade="SILVER";
        bonusRatio=0.0;
    }
    public int calcPrice(int price){
        bonusPoint+=price*bonusRatio;
        return price;
    }
    public String showCustomerInfo(){
        return customerName+"님의 등급은 "+customerGrade+"이고, 적립된 포인트는 "+bonusPoint;
    }
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
