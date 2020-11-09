package designmode.singleton;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/3 16:09
 * @Company: Si-tech
 * @Description:单例模式懒汉式：类加载时没有对象，在调用getInstance方法时调用对象
 **/
public class LazySingleton {
    //保证instance在所有线程中同步
    private static volatile LazySingleton instance=null;
    //避免类在外部被实例化
    private LazySingleton(){};
    //getInstance方法前加同步
    public static synchronized LazySingleton getInstance(){
        if(instance==null){
            instance =new LazySingleton();
        }
        return instance;
    }
}
