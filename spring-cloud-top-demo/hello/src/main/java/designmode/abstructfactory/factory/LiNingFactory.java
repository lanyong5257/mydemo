package designmode.abstructfactory.factory;

import designmode.abstructfactory.product.Clothes;
import designmode.abstructfactory.product.Shoe;
import designmode.abstructfactory.product.lining.LiNingClothes;
import designmode.abstructfactory.product.lining.LiNingShoe;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 16:13
 * @Company: Si-tech
 * @Description:
 **/
public class LiNingFactory implements AbstractFactory {

    @Override
    public Shoe createShoe() {
        return new LiNingShoe();
    }

    @Override
    public Clothes createClothes() {
        return new LiNingClothes();
    }
}
