package designmode.factorymethod.factory;


import designmode.factorymethod.product.LiNingShoe;
import designmode.factorymethod.product.Shoe;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 15:02
 * @Company: Si-tech
 * @Description:奥迪q7工厂类
 **/
public class FactoryLiNingShoe implements FactoryShoe {


    @Override
    public Shoe createShoe() {
        return new LiNingShoe();
    }
}
