package designmode.abstructfactory.factory;

import designmode.abstructfactory.product.Clothes;
import designmode.abstructfactory.product.Shoe;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 16:10
 * @Company: Si-tech
 * @Description:
 **/
public interface AbstractFactory {
    public Shoe createShoe();
    public Clothes createClothes();
}
