package designmode.abstructfactory.product.nike;

import designmode.abstructfactory.product.Clothes;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 15:58
 * @Company: Si-tech
 * @Description:
 **/
public class NikeClothes implements Clothes {
    public NikeClothes(){
        System.out.println("制造->nike的衣服");
    }
}
