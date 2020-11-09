package designmode.abstructfactory.product.nike;

import designmode.abstructfactory.product.Shoe;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/6 15:57
 * @Company: Si-tech
 * @Description:
 **/
public class NikeShoe implements Shoe {
    public NikeShoe(){
        System.out.println("制造->Nike的鞋子");
    }
}
