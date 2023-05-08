public class java039_common_object_compare {
    public static void main(String[] args){
        /**
         * 比较
         * 所有的基本数据类型 都用 “==”
         * 所有的引用数据类型 都用 “equals” 方法
         *
         */

        // 基本数据类型的比较
        int a1 = 10;
        float a2 = 10.0f;
        System.out.println(a1 == a2);       // true
        // 基本数据类型，即使类型不同，数值 只要一样 仍为 true

        String a3 = "hello",        // 字符串常量池
                a4 = "hello";
        System.out.println(a3 == a4);       // true
        // 引用数据类型 "==" 比较变量的内存地址
        String a5 = new String("hello"); // 新的字符串 对象
        System.out.println(a5.equals(a3));      // 使用equals 方法 进行判断


    }
}

// 重写 equals 方法
class User38{
    public boolean equals(Object obj) {
        return true;
    }
}