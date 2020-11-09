package designmode.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/3 16:19
 * @Company: Si-tech
 * @Description:单例模式：饿汉式，类一旦加载就创建一个单例，保证在调用getInstance方法之前单例就已经存在
 **/
public class HungrySingleton {
    private static final HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){};
    public static HungrySingleton getInstance() {

        return instance;
    }
}
