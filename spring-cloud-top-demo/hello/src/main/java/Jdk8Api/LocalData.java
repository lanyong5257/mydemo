package Jdk8Api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Author: lanyong_csd
 * @Create: 2019/12/4 14:01
 * @Company: Si-tech
 * @Description:
 **/
public class LocalData {
    public static void main(String[] args) {
        //当前日期及具体时间
        LocalDateTime l=LocalDateTime.now();
        //时区选择
        ZoneId zone= ZoneId.of(ZoneId.SHORT_IDS.get("VST"));
        //获取具体时区时间
        ZonedDateTime z=ZonedDateTime.of(l,zone);
        System.out.println(z);
        String s="123";
        System.out.println(s.length());
    }
}
