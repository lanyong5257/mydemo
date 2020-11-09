package designmode.factorymethod.factory;

import designmode.factorymethod.factory.FactoryLiNingShoe;
import designmode.factorymethod.factory.FactoryNikeShoe;
import designmode.factorymethod.factory.FactoryShoe;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 15:03
 * @Company: Si-tech
 * @Description:工厂方法测试类
 **/
public class Customer {
    public static void main(String[] args) {
        FactoryShoe factoryShoe=new FactoryLiNingShoe();
        factoryShoe.createShoe();
        FactoryShoe factoryShoe1=new FactoryNikeShoe();
        factoryShoe1.createShoe();
    }
}
