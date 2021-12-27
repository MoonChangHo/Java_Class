package problem4;

public class CHmenu {
    private static final String ICEAMERICANO = "1. Ice Americano 4500";
    private static final String LATTE = "2. Latte  5000";
    private static final String LEMONADE = "3. Lemon Ade  5500";
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

 */

    public void showMenu(){
        System.out.println("---CoffeeHouse_Menu---");
        System.out.println(ICEAMERICANO+"\n"+LATTE+"\n"+LEMONADE);
        System.out.println("--------------------------");
    }
}
