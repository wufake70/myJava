public class java015_create_object {
    public static void main(String[] args){
        // 构建对象
        // 构造方法: 专门用于构建对象
        //
        // 基本语法: 类名() {}
        // 构造方法 也是方法，但没有void 关键
        // 方法名和 类名完全相同
        // 如果 类中没有 构造方法，jvm 会提供默认 构造方法(公共的，无参的)
        // 如果 类中有 构造方法，jvm 不会提供默认 构造方法

        System.out.println("before.....");
        User02 a = new User02("张三",77);
        System.out.println("after......");
        System.out.println(a.name);

        /**
         * 注意: 类里面 代码块({ .... })，在创建对象前(即 在构造方法执行前) 会自动执行
         */



    }
}

class User02{
    // 构造方法 没有void 关键字
    User02(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("对象构造完成.....");
    }
    String name;
    int age;

}