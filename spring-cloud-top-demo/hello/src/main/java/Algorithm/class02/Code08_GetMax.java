package Algorithm.class02;

/**
 * @Author: lanyong_csd
 * @Create: 2020/9/15 11:38
 * @Company: Si-tech
 * @Description:L-R上递归求最大最小值
 **/
public class Code08_GetMax {
    public static void main(String[] args) {
        int[] arr={2,3,1,22,14,22,42};
        System.out.println(getMax(arr));
    }
    public static int getMax(int[]arr){
        return process(arr,0,arr.length-1);
    }
    public static int process(int[]arr,int L,int R){
        if(L==R){
            return arr[L];
        }
        int mid=L +((R-L)>>1);
        int leftMax=process(arr,L,mid);
        int rightMax=process(arr,mid+1,R);
        return Math.max(leftMax,rightMax);

    }
}
