package thread;

/**
 * @Author: lanyong_csd
 * @Create: 2019/12/16 19:27
 * @Company: Si-tech
 * @Description:
 **/
public class SleepYieldJoin {
    public static void main(String[] args) {
//    testYield();
//        testJoin();
        testJoin();
    }
    static void testSleep(){
        new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("A"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    static void testYield(){
        new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("A"+i);
                if(i%10==0) {Thread.yield();}
            }
        }).start();
        new Thread(()->{
           for(int i=0;i<100;i++){
               System.out.println("B"+i);
               if(i%10==0) {Thread.yield();}
           }
        }).start();
    }
    static void testJoin(){
       Thread t1= new Thread(()->{

                try {
                    Thread.sleep(500);
                    System.out.println("This is Thread1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        });
       Thread t2=new Thread(()->{

           try {
               t1.join();
               System.out.println("This is Thread2");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       });
       Thread t3=new Thread(()->{

           try {
               t2.join();
               System.out.println("This is thread3");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       });
       t1.start();
       t2.start();
       t3.start();
    }
}
