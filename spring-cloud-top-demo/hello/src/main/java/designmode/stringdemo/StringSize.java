package designmode.stringdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: lanyong_csd
 * @Create: 2020/11/9 23:43
 * @Company: Si-tech
 * @Description:统计字符串每个字符出现的次数
 *
 **/
public class StringSize {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            String ch1 = String.valueOf(chars[i]);
            if(!map.containsKey(ch1)){
                map.put(ch1,1);
            }else {
                Integer count = map.get(ch1);
                map.put(ch1,count+1);
            }
//            String char1 = String.valueOf(chars[i]);
//             map.put(char1, map.getOrDefault(char1, 0) + 1);
        }
        map.forEach((k,v)-> System.out.println(k+"出现的次数为"+v));
    }
}
