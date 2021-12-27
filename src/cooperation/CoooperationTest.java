package cooperation;

public class CoooperationTest {
    public static void main(String[] args) {
        Bus bus4322=new Bus(4322);
        Subway subway7=new Subway(7);
        Student Park=new Student("박진영",17,10000);
        Park.showInfo();

        Park.useBus(bus4322);
        bus4322.showBusInfo();
        Park.showInfo();

        Park.useSubway(subway7);
        subway7.showSubwayInfo();
        Park.showInfo();
    }
}
