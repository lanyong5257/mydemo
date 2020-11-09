package designmode.singleton;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/4 9:15
 * @Company: Si-tech
 * @Description:懒汉式demo
 **/
public class LazySingletonDemo {
    public static void main(String[] args) {
        President instance1 = President.getInstance();
        instance1.getName();
        President instance2=President.getInstance();
        instance2.getName();
        if(instance1==instance2){
            System.out.println("他们是同一个人");
        }else {
            System.out.println("不是同一个人");
        }
    }
}
class President{
    private static volatile President instance=null;
    private President(){
        System.out.println("产生一个新总统");
    }
    public synchronized static President getInstance(){
        if(instance==null){
            instance=new President();
        }else {
            System.out.println("已经有一位新总统了,不能产生总统了");
        }
        return instance;
    }
    public void getName(){
        System.out.println("我是美国总统：奥巴马");
    }
}
