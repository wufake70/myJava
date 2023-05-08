import java.util.Date;

public class java058_Process_Thread {
    public static void main(String[] args){
        /**
         * java 代码的编译 执行过程
         *  javac xxx.java      编译器 编成 java字节码文件
         *  java xxx            java.exe  启动 jvm 并执行字节码文件
         *
         *  执行一个 java程序 就会产生一个 进程。
         *  进程中 会有一个 主线程(main)，代码在主线程中执行。
         *
         */

        // 获取当前线程额名称
        System.out.println("主线程名称:  "+Thread.currentThread().getName());   // 返回 main

        // 创建线程
        MyThread t1 = new MyThread();
        // 启动线程
        t1.start();
//        while (true) {}

        /**
         * 线程生命周期
         *      线程的可运行状态
         *          NEW
         *          RUNNABLE
         *          TERMINATED 终止
         *
         *          其他状态，不可运行
         *          BLOCKED     阻塞
         *          WAITING     等待
         *          TIMED_WAITING   定时等待
         */


        // 把要执行的逻辑code 直接传给 （Thread类）线程对象
        // 免去 新建一个类，在重写 run方法的 过程
        Thread t2 = new Thread(()->{
            System.out.println("子线程休眠3秒....");
            long time1 = new Date().getTime();
            try {
                Thread.sleep(3000);
            }catch (Exception e) {
                System.out.println(e);
            }
            long time2 = new Date().getTime();
            System.out.println("计时器: "+(time2-time1));
        });

        t2.start();



    }
}

// 声明自定义线程类
class MyThread extends Thread{
    // 重写 运行指令
    public void run(){
        System.out.println("子线程名称:  "+Thread.currentThread().getName());
//        while (true) System.out.println(9);

    }
}