import java.util.Stack;

public class java028_object_space {
    public static void main(String[] args){

        /**
         * 作用域
         *
         */
        Child28 a = new Child28();
        a.test();



    }

}
class User28{
    public static String name = "张三";
}
class Child28 extends User28{
    public static String name = "李四";

//    public void test (){
////        String name = "王五";
//        // 如果属性和局部变量 名字相同 ，访问时不加修饰符，那么优先访问 变量
//        // 当父子类存在相同的属性时（注释掉王五），name 相当于 this.name
//        System.out.println(name);
//        System.out.println(super.name); // 可以通过 super 关键字 访问 父类的 同名属性
//    }
    public static void test(){
        System.out.println(name);   // 李四 name == this.name

        // 在静态方法中 无法使用 super，静态方法 只与类有关，
        // super 和 this 指向的都是对象，在静态方法无法使用(对象还没创建)
        // 在 Java 中，静态方法不能访问非静态成员，因为静态方法是类级别的，而非静态成员是对象级别的。
        // 在静态方法中，不能使用 this 关键字来访问对象的成员，
        // 也不能使用 super 关键字来访问父类的成员。
        // 如果需要在静态方法中访问父类的成员，可以使用类名来访问。
//        System.out.println(super.name);

        //可以使用 类名 来直接访问 父类静态属性
        System.out.println(User28.name);
    }

}