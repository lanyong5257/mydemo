package Algorithm.class01;

import java.util.Arrays;

/**
 * @Author: lanyong_csd
 * @Create: 2020/9/14 17:44
 * @Company: Si-tech
 * @Description:
 **/
public class Code01_InsertionSort {
    public static void main(String[] args) {
      int[]arr={1,2,1,53,12,32,5231,123};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[]arr){
        if(arr==null ||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0 ;j--){
                if(arr[j]>arr[j+1]){
                swap1(arr,i,j);
                }
            }
        }
    }
    public static void swap(int[]arr,int i,int j){
            arr[i]=arr[i]^arr[j];
            arr[j]=arr[i]^arr[j];
            arr[i]=arr[i]^arr[j];
    }
    public static void swap1(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
