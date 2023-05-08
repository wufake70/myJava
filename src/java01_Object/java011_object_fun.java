public class java011_object_fun {
    public static void main(String[] args){

        /**
         * java 函数(方法):
         *          不能再 函数中声明函数
         *
         */
        User01 b = new User01();
        b.DoThing("wufake",9,99,0,9);
        b.DoThing("wufake",9,99,0,9);

//        int a = 1; // 这里 栈帧 保存变量 a，和基本数据
//        fun1(a);   // 这里 将 开始一个栈帧，并且有"压栈"，传入的a形参 只存在于这个栈帧里，当函数执行完，就"弹栈" 形参 a 也就消失了，
//        System.out.println(a);      // 返回 1，不是 101

        String a = "abc";   // 引用数据，保存在 堆中，a 保存的 地址值
        fun2(a);            // 产生新栈帧 并 "压栈"，这里 a 也指向 同一 "abc"
                            // 但是 函数中 a+10 拼接的操作 产生新字符串，这里的 a 指向 新字符串，
                            // 然后弹栈，不影响 上一级 a变量 的指向关系
        System.out.println(a);      // 返回 "adc",不是 ”abc10“


    }

    // 创建 函数（不能再 main函数中 创建）
    public static void fun1(int i){
        i += 100;
    }
    public static void fun2(String a){
        a = a + 10;  // 拼串 操作，产生新的 字符串
    }
}

class User01{

    // 函数 传入形参，格式: 数据类型 变量名
    // 传入 可变参数,必须放在最后面,它们将被视为该类型的 数组
    void DoThing(String name,int... a){
//        使用循环 遍历
//        for (int b:a){            // 类似Python for b in a:
        for (int i=0;i<a.length; i++){
//            System.out.print(b + " ");        // print 方法 不换行
            System.out.print(a[i] + " ");
        }

        /**
         * void 类型不用 返回值
         */
    }


}
