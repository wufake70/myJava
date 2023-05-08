import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class java064_Thread_safety {
    public static void main(String[] args) throws InterruptedException {
        /**
         *  线程安全问题
         *      多个线程在 并发执行时，修改了共享内存中共享对象的属性，导致数据冲突
         */
        ExecutorService ES = Executors.newFixedThreadPool(2);

        final int[] counts = {0};
//        int counts1 = 0;

        // Runnable类是实现了Runnable接口的类，可以用来创建线程。
        ES.submit(new Runnable() {
            @Override
            public void run() {
//                int counts1 = 0;
                // java 会给 每一个线程对象分配 栈内存，
                // 意味着 无法 使用 (外部类中)基本数据类型的变量，counts1
                // 只能使用 对象保存
//                for (int i=0;i<1000;i++) counts1++; 报错

                for (int i=0;i<100000;i++) counts[0]++;
            }
        });
        ES.submit(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100000;i++) counts[0]--;
            }
        });
        ES.shutdown();
        ES.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println("结果为: "+counts[0]);      // 不是定值

    }
}
