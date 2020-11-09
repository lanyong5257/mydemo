package Algorithm.class01;

/**
 * @Author: lanyong_csd
 * @Create: 2020/9/15 9:22
 * @Company: Si-tech
 * @Description:
 **/
public class Code04_EvenTimeOddTime {
    public static void main(String[] args) {
        int[] arr={2,1,1,2,132,132,22,3};
        printEorTimeNum2(arr);
//        printEorTimeNum1(arr);
        printBit(65535);
    }
    //算出数组中只有一个奇数的值
    public static void printEorTimeNum1(int[] arr){
        int eor=0;
        for(int i=0;i<arr.length;i++){
        eor^=arr[i];
         }
        System.out.println(eor);
    }
    public static void printEorTimeNum2(int[]arr){
        int eor=0;
        for(int i=0;i<arr.length;i++){
            eor^=arr[i];
        }
        int rightOne=eor&((~eor)+1);
        int only1=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&rightOne)==0){
                only1^=arr[i];
            }
        }
        System.out.println(only1+"  "+(eor^only1));
    }

    public static void printBit(int N){
        int count=0;
        while (N!=0){
            int rightOne=N&((~N)+1);
            N^=rightOne;
            count++;
        }
        System.out.println(count);
    }
}
