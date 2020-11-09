package thread;

import javafx.concurrent.Task;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @Author: lanyong_csd
 * @Create: 2020/1/15 11:05
 * @Company: Si-tech
 * @Description:
 **/
public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService excutor = Executors.newCachedThreadPool();
        Future<Integer> future = excutor.submit(new MyTask());
        System.out.println(future.get());
        excutor.shutdown();
    }
    private static class MyTask implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            System.out.println("子进程正在计算");
            Thread.sleep(2000);
            return 1;
        }
    }
}

