package problem4;

public class CoffeTest {
    public static void main(String[] args) {
        StarCoffeeHouse ST=new StarCoffeeHouse();
        CoffeeHouse CH=new CoffeeHouse();

        User Park=new User("박민성",50000);

        Park.userInfo();

        CH.showMenu();
        Park.byCoffeeHouse(CH,3,4500);
        Park.userInfo();

        ST.showMenu();
        Park.byStarCoffeeHouse(ST,4,7000);
        Park.userInfo();

    }
}
