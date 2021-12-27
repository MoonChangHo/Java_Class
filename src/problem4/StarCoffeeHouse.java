package problem4;

import java.sql.SQLOutput;

public class StarCoffeeHouse {
    private int income=0;
    private int sellCount=0;
    private SCHmenu menu = new SCHmenu();

    public void showMenu(){
        menu.showMenu();
    }
    public void sellingIce(int money){
        income+=money;
        sellCount+=1;
    }
    public void sellingLemon(int money){
        income+=money;
        sellCount+=1;
    }

    public void sellinglatte(int money){
        income+=money;
        sellCount+=1;
    }
    public void sellingStar(int money){
        income+=money;
        sellCount+=1;
    }
    public void showStarInfo(){
        System.out.println("총 판매 개수:"+sellCount);
        System.out.println("총 수익:"+income);
    }

}
