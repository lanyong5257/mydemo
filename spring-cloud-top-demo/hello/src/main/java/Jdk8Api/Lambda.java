package Jdk8Api;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lanyong_csd
 * @Create: 2019/12/4 15:01
 * @Company: Si-tech
 * @Description:拉姆达表达式的用法
 **/
public class Lambda {
    //筛选颜色为红色
    public List<Product> filterProductByColor(List<Product> list){
        List<Product> prods=new ArrayList<>();
        for(Product prod:list){
            if("红色".equals(prod.getColor())){
                prods.add(prod);
            }
        }
        return prods;
    }
    //筛选价格大于1000
    public List<Product> filterProductByPrice(List<Product> list){
        List<Product> prods=new ArrayList<>();
        for(Product prod:list){
            if(prod.getPrice()>8000){
                prods.add(prod);
            }
        }
        return prods;
    }

}
