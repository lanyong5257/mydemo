package designmode.factorymethod.factory;

import designmode.factorymethod.product.Shoe;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 16:29
 * @Company: Si-tech
 * @Description:
 **/
public interface FactoryShoe {
    public Shoe createShoe();
}
