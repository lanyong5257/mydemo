package designmode.abstructfactory;

import designmode.abstructfactory.factory.LiNingFactory;
import designmode.abstructfactory.factory.NikeFactory;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 15:49
 * @Company: Si-tech
 * @Description:
 **/
public class Consumer {
    public static void main(String[] args) {
        LiNingFactory liNingFactory=new LiNingFactory();
        liNingFactory.createClothes();
        liNingFactory.createShoe();
        NikeFactory nikeFactory=new NikeFactory();
        nikeFactory.createClothes();
        nikeFactory.createShoe();
    }
}
