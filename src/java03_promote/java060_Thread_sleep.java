import java.text.SimpleDateFormat;
import java.util.Date;

public class java060_Thread_sleep {
    public static void main(String[] args) throws Exception{
        /**
         *  线程休眠
         *
         */

        MyThread3 t1 = new MyThread3();
        t1.start();

        // 计时器开启
        final long a1 = new Date().getTime();
        // 让当前主线程休眠 3秒
        // sleep 是一个 静态方法，在哪个成员方法 中都可以调用
        Thread.sleep(3000);
        // 计时器关闭
        final long a2 = new Date().getTime();
        System.out.println("主程序休眠了 "+(a2-a1));




    }

}
class MyThread3 extends Thread {
    public void run(){
        try {
            final long a1 = new Date().getTime();
            Thread.sleep(3000);
            final long a2 = new Date().getTime();
            System.out.println("子程序休眠了 " + (a2 - a1));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}