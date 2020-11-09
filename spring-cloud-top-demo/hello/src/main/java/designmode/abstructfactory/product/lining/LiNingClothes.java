package designmode.abstructfactory.product.lining;

import designmode.abstructfactory.product.Clothes;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 16:00
 * @Company: Si-tech
 * @Description:
 **/
public class LiNingClothes implements Clothes {
    public LiNingClothes(){
        System.out.println("制造->李宁的衣服");
    }
}
