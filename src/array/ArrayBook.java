package array;

public class ArrayBook {
    public static void main(String[] args) {
        Array[] series=new Array[5];        //배열 생성 (5)
        Array[] seriesCopy=new Array[5];
        Array[] deepSeriesCopy=new Array[5];

        for (int i=0;i<series.length;i++) {
            series[i] = new Array("김광석", "전광석화"+(i+1));
            series[i].showBookInfo();
        }

        System.arraycopy(series,0,seriesCopy,0,5);
        System.out.println("----------복사------------");

        for (Array arr:seriesCopy){     //향상된 for문: 배열 크기만큼 반복
            arr.showBookInfo();
        }

        series[0].setTitle("백만볼트1");
        series[0].setAuthor("김석");

        System.out.println("-----------얕은 복사---------");
        for (Array arr:seriesCopy){     //얕은 복사: 주소만 복사
            arr.showBookInfo();
        }

        for (int i=0;i< deepSeriesCopy.length;i++) {
            deepSeriesCopy[i] = new Array();
            deepSeriesCopy[i].setTitle(series[i].getTitle());
            deepSeriesCopy[i].setAuthor(series[i].getAuthor());
        }

        series[0].setTitle("백만볼트2");
        series[0].setAuthor("김석");

        System.out.println("-------------깊은복사---------------");
        for (Array arr1:deepSeriesCopy){        //깊은 복사:Systen.arraycopy()사용 X, 하나하나 복사
            arr1.showBookInfo();
        }
    }
}
