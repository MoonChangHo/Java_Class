package problem4;

public class SCHmenu {
    private static final String ICEAMERICANO = "1.IceAmericano5500";
    private static final String LATTE = "2.Latte6000";
    private static final String LEMONADE = "3.LemonAde6500";
    private static final String STAR="4.STAR7000";

    /*
    public int ice() {
        int iceAmericano = Integer.parseInt(ICEAMERICANO.substring(4));
        return iceAmericano;
    }
    public int lat() {
        int latte = Integer.parseInt(LATTE.substring(4));
        return latte;
    }
    public int lemon() {
        int lemonAde = Integer.parseInt(LEMONADE.substring(4));
        return lemonAde;
    }
    public int st() {
        int star = Integer.parseInt(STAR.substring(4));
        return star;
    }
    */

    public void showMenu(){
        System.out.println("---StarCoffeeHouse-Menu---");
        System.out.println(ICEAMERICANO+"\n"+LATTE+"\n"+LEMONADE+"\n"+STAR);
        System.out.println("--------------------------");
    }
}
