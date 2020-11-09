package com.lanyong.tank;

/**
 * @Author: lanyong_csd
 * @Create: 2020/11/2 22:13
 * @Company: Si-tech
 * @Description:
 **/
public class T {
    public static void main(String[] args) {
       TankFrame t=new TankFrame();
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.repaint();
        }
    }
}
