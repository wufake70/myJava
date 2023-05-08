public class java059_chuanxing_bingfa {
    public static void main(String[] args) throws Exception{
        /**
         * 串行: 指按照顺序一个接一个地执行任务。这意味着每个任务在上一个任务完成之前不能开始。
         *
         * 并发: 指在同一时间段内执行多个任务。这通常是通过在 单核处理器 上使用 多线程来实现的。
         *
         */
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.start();
        t2.start();   // 默认 是 并发执行的 多个线程 独立的，谁抢到cpu的执行权，谁就执行

        // 串行，将线程 链接成串
        t2.join();
        t1.join();      // 主线程 最后结束


        System.out.println("主线程 执行完毕");



    }
}
class MyThread1 extends Thread{

    public void run(){
        System.out.println("子线程名称:  "+Thread.currentThread().getName());

    }

}

