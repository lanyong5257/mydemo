package Foundation;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lanyong_csd
 * @Create: 2019/10/13 20:58
 * @Company: Si-tech
 * @Description:
 **/
public class Hello {
    int id;
    int age=20;

    public static void main(String[] args) {
        Hello hello=new Hello();
        Map map=new HashMap();
        map.put("1","zhangsan");
        map.put("2","lisi");
        System.out.println(map);
    }
}

