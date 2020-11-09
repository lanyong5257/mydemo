package com.lanyong.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: lanyong_csd
 * @Create: 2020/11/2 22:37
 * @Company: Si-tech
 * @Description:
 **/
public class TankFrame extends Frame {
    int x=200;
    int y=200;
    public TankFrame(){
        setSize(800,900);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);
        addKeyListener(new MyKeyListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.fillRect(x,y,50,50);
//        x+=10;
    }
    class MyKeyListener extends KeyAdapter{
        boolean bL=false;
        boolean bU=false;
        boolean bR=false;
        boolean bD=false;
        @Override
        public void keyPressed(KeyEvent e) {
            int key=e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:
                    bL=true;
                    break;
                case KeyEvent.VK_UP:
                    bU=true;;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR=true;;
                    break;
                case KeyEvent.VK_DOWN:
                    bD=true;;
                    break;
                    default:
                        break;
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {
            int key=e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:
                    bL=false;
                    break;
                case KeyEvent.VK_UP:
                    bU=false;;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR=false;;
                    break;
                case KeyEvent.VK_DOWN:
                    bD=false;;
                    break;
                default:
                    break;
            }
        }

    }
}
