package Algorithm.class01;

import java.util.Arrays;

/**
 * @Author: lanyong_csd
 * @Create: 2020/9/14 13:57
 * @Company: Si-tech
 * @Description:选择排序
 **/
public class Code03_SelectSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,56,23,132,1,42,1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[]arr){
        if(arr==null || arr.length<2){
            return;
        }
        //0~N-1
        for(int i=0;i<arr.length-1;i++){
            //最小值放在 i位置,j的数值如果比i大那么把index放在j位置
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(i,minIndex,arr);
        }
    }
    public static void swap(int i,int j,int[]arr){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
