package thread;

/**
 * @Author: lanyong_csd
 * @Create: 2019/12/13 12:38
 * @Company: Si-tech
 * @Description:
 **/
public class HowToCreatThread {
    public static void main(String[] args) {
        System.out.println("蒋旻是个瓜娃子" );
        new Thread(()->{
            System.out.println("hello world");
        }).start();
        new MyThread().start();
        new Thread(new MyRun()).start();
    }

    static class MyThread extends Thread {
        @Override
        public void run(){
            System.out.println("This is myThread");
        }
    }
    static class MyRun implements Runnable{

        @Override
        public void run() {
            System.out.println("This is my runnable");
        }
    }
}
