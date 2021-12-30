package array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total=0;
        for (int i = 0,num=1; i < arr.length; i++,num++) {
            arr[i]=num;
            System.out.println(arr[i]);
            total+=arr[i];
        }
        System.out.println(total);

        double[] arr1=new double[5];
        int count=0;
        arr1[0]=1.1;count++;
        arr1[1]=2.2;count++;
        arr1[2]=3.3;count++;
        total=1;
        for(int i=0,num=1;i<count;i++,num++){
            total*=arr[1];
        }
        System.out.println(total);
    }
}
