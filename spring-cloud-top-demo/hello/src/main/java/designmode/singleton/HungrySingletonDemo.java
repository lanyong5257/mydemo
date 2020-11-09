package designmode.singleton;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 11:25
 * @Company: Si-tech
 * @Description:饿汉式单例模式实例
 **/
public class HungrySingletonDemo {
    public static void main(String[] args) {
        President1 instance1 = President1.getInstance();
        instance1.getName();
        President1 instance2=President1.getInstance();
        instance2.getName();
        if (instance1==instance2){
            System.out.println("他们是同一个人");
        }else {
            System.out.println("他们是不同的人");
        }
    }
}
class President1{
    private static President1 president=new President1();
    private President1(){
        System.out.println("产生一个新总统");
    };
    public static President1 getInstance(){
        System.out.println("已经有一个总统了，不能产生新总统");
        return president;
    }
    public void getName(){
        System.out.println("我是美国总统特朗普");
    }
}
