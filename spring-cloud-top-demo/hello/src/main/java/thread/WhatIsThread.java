package thread;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/2 15:40
 * @Company: Si-tech
 * @Description:什么是线程
 **/
public class WhatIsThread {
    public static void main(String[] args) {
        new T1().start();
        for(int i=0;i<10;i++){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
    private static class T1 extends Thread{
            @Override
            public void run(){
                for(int i=0;i<10;i++){
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("This is T1");
                }
            }
    }

}
