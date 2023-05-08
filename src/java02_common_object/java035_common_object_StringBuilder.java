public class java035_common_object_StringBuilder {
    public static void main(String[] args){
        /**
         * StringBuilder：   构造字符串
         * 字符串的 拼接, +、concat、效率低，会构建大量的字符串，可以使用StringBuilder
         */
        StringBuilder a = new StringBuilder();
        for (int i=0;i<100;i++) {
            a.append(i);
        }
        System.out.println(a);
        // 将字符串 反转
        System.out.println(a.reverse());
        // 插入
        System.out.println(a.insert(0, "hello"));
    }
}
