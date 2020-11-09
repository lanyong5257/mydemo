package Algorithm.class01;

import java.util.Arrays;

/**
 * @Author: lanyong_csd
 * @Create: 2020/9/14 8:40
 * @Company: Si-tech
 * @Description:
 **/
public class Code02_MaoPaoSort {
    public static void main(String[] args) {
        int[]arr={1,2,1,6,7,3,1,1,232,1,1,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[]arr){
        if(arr==null ||arr.length<2){
            return;
        }
        //0_n;0_n-1
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
    }
    public static void swap(int i,int j,int[] arr){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }

}
