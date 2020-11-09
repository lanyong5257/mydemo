package designmode.factorymethod.factory;
import designmode.factorymethod.product.NikeShoe;
import designmode.factorymethod.product.Shoe;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 15:01
 * @Company: Si-tech
 * @Description:工厂类
 **/
public class FactoryNikeShoe implements FactoryShoe {


    @Override
    public Shoe createShoe() {
        return new NikeShoe();
    }
}
