package problem4;

public class User {
    private String useName;
    private int money;

    public User(String name, int money) {
        this.useName = name;
        this.money = money;
    }

    public void byCoffeeHouse(CoffeeHouse coffeehouse, int number,int money) {
        CHmenu menu = new CHmenu();
        switch (number) {
            case 1:
                System.out.println("아이스 아메리카노 입니다.");
                coffeehouse.sellingIce(money);
                this.money -= money;
                break;
            case 2:
                System.out.println("라떼 입니다.");
                coffeehouse.sellinglatte(money);
                this.money -= money;
                break;
            case 3:
                System.out.println("레몬에이드 입니다.");
                coffeehouse.sellingLemon(money);
                this.money -= money;
                break;
            default:
                System.out.println("없는 메뉴입니다.");
                break;
        }
    }

    public void byStarCoffeeHouse(StarCoffeeHouse starCoffeeHouse, int number,int money) {
        SCHmenu menu = new SCHmenu();
        switch (number) {
            case 1:
                System.out.println("아이스 아메리카노 입니다.");
                starCoffeeHouse.sellingIce(money);
                this.money -= money;
                break;
            case 2:
                System.out.println("라떼 입니다.");
                starCoffeeHouse.sellinglatte(money);
                this.money -= money;
                break;
            case 3:
                System.out.println("레몬에이드 입니다.");
                starCoffeeHouse.sellingLemon(money);
                this.money -= money;
                break;
            case 4:
                System.out.println("star커피 입니다.");
                starCoffeeHouse.sellingStar(money);
                this.money -= money;
                break;
            default:
                System.out.println("없는 메뉴입니다.");
                break;


        }

    }
    public void userInfo(){
        System.out.println(useName+"님의 잔액:"+money);
    }
}
