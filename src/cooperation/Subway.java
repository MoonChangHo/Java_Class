package cooperation;

public class Subway {
    int nodeNumber;
    int count=0;
    int income=0;
    public Subway(int nodeNumber){
        this.nodeNumber=nodeNumber;
    }
    public void take(int money){        //승차
        this.income=money;
        count++;
    }
    public void showSubwayInfo(){
        System.out.println(nodeNumber+"호선의 승객:"+count+"명 , 수입 : "+income);
    }
}
