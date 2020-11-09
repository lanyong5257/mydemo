package Foundation;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/20 14:15
 * @Company: Si-tech
 * @Description:
 **/
public class WhileB {
    public static void main(String[] args) {
        for(int i=0;i<=20;i++){
            for(int j=0;j<=34;j++){
                for(int k=0;k<=300;k++){
                    if((i+j+k)==100&&(5*i+3*j+k/3==100)){
                        System.out.println("公鸡"+i+"母鸡"+j+"小鸡"+k);
                    }
                }
            }
        }
    }
}
