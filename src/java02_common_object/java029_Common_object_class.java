public class java029_Common_object_class {
    public static void main(String[] args){
        /**
         * 常见类和对象 Object
         *
         *
         */

        // User29_ 是 Object 的 子孙类(超类)
        Object a = new User29_();   // 多态 --限制当前对象，只能使用 Object 的方法

        // 每一个对象 都有toString方法
        // 将对象 转换为 字符串,内存地址
        System.out.println(a.toString());

        // 获取 对象内存地址，十进制
        System.out.println(a.hashCode());

        // 判断两个对象 是否相等,也可以重写 equals
        System.out.println(a.equals(new User29()));

        // 获取对象的类型信息
        System.out.println(a.getClass());

    }
}
class User29{     // 等同关系 class User29 extends Object{ 默认继承 Object

    String name;
    // 重写 toString方法
//    public String toString(){
//        return "User29["+name+"]";
//    }

}
class User29_ extends User29{   // User29_ 是 Object 的 子孙类(超类)

}