public class java023_object_final {
    public static void main(String[] args){
        /**
         * java 中提供了一种语法，可以在数据初始化后 不被修改，使用关键字 final
         *  final 也可以修饰属性: 那么jvm将无法进行初始化，需要自己进行初始化,也不能被修改
         *
         * final 修饰的变量 称之为 常量，或 不可变量
         *
         * final 也可以修饰 方法，但之后 不能被子类 重写
         *
         * final 也可以修饰 类，没有子类
         *
         * final 不可以修饰 构造方法
         *
         * final 可以修饰 方法的参数，意味着 该参数不能被修改
         */

        final int a = 9;
//        a = 99;
        User19 b = new User19("无法可");
//        b.name = "99";
    }
}
class User19{
//    final String name = "wufake";
    final String name;

    User19(String name) {
        this.name = name;
    }

    void test(final String a){
//        a = a + "  ";  无法修改该参数

    }
}