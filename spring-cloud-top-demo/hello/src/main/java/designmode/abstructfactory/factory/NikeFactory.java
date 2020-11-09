package designmode.abstructfactory.factory;

import designmode.abstructfactory.product.Clothes;
import designmode.abstructfactory.product.Shoe;
import designmode.abstructfactory.product.nike.NikeClothes;
import designmode.abstructfactory.product.nike.NikeShoe;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 16:13
 * @Company: Si-tech
 * @Description:
 **/
public class NikeFactory implements AbstractFactory {

    @Override
    public Shoe createShoe() {
        return new NikeShoe();
    }

    @Override
    public Clothes createClothes() {
        return new NikeClothes();
    }
}
