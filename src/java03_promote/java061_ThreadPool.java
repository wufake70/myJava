import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class java061_ThreadPool{
    public static void main(String[] agrs) throws InterruptedException {

        /**
         *  线程池
         *      多个可重复利用的线程
         *
         * java 有四种 常见的线程池
         *
         */
        // 一、创建 固定数量线程池对象，
//        ExecutorService ES = Executors.newFixedThreadPool(9);

        // 二、动态创建 线程
//        ExecutorService ES = Executors.newCachedThreadPool();

        // 三、单一线程
//        ExecutorService ES = Executors.newSingleThreadExecutor();

        // 四、定时 调用线程
        ExecutorService ES = Executors.newScheduledThreadPool(10);

        // 定时器
        long timer1 = new Date().getTime();

        for(int i=0;i<10;i++) {
//            System.out.println("*****");
            // 向线程池 提交任务,for循环提交任务，线程池 会将 提交的任务列表 逐一的分配给 闲置的线程
            // 也就是 for循环执行完了，任务也提交完了，单任务还未执行完
            int finalI = i;
            ES.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print(finalI +", ");
                }
            });
        }

        // 任务提交完后 关闭线程池(不调用 程序一直 运行)
        ES.shutdown();
        // 等待线程池中的任务 全部执行完,在执行主线程代码(即 阻塞主线程)
        ES.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        long timer2 = new Date().getTime();    // 定时器
        System.out.println("\n");
        System.out.println("用时: "+(timer2-timer1));



    }
}
