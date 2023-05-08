import java.util.concurrent.ArrayBlockingQueue;

public class java049_common_Collection_Queue {
    public static void main(String[] args) throws InterruptedException {

        /**
         *  队列  queue
         *          先进先出
         *
         *
         */
        System.out.println("================创建===============");
        // array + blocking（阻塞）+queue（队列）
        // 必须传入 长度
        ArrayBlockingQueue q = new ArrayBlockingQueue(3);
        // add 无阻塞，直接报错
//        q.add("张三");
//        q.add("李四");
//        q.add("王五");

//        q.put("90");
//        q.put("990");
//        q.put("9990");
//        q.put("8888");      //开始阻塞

        q.offer(999);       // 不会阻塞，不会报错，返回布尔值
        q.offer(9990);
        q.offer(99900);
        q.offer(9990000);       // 返回 false
        System.out.println(q);

        System.out.println("=================取出=============");
        // 取出一个就会 少一个
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
//        System.out.println(q.poll());       // 没有返回 null

        System.out.println(q.take());       // 会阻塞
        System.out.println(q);


//        q.size();
//        q.clear();
//        q.contains();
//        q.isEmpty();

    }
}
