import java.util.ArrayList;

public class java046_common_Collection_fanxing {
    public static void main(String[] args){
        /**
         * 泛型(<param>类型参数):
         *      Java 泛型是 Java 编程语言中的一种机制，它允许程序员在编译时类型检查。
         *      泛型可以让程序员在编码时使用参数化类型，在编译时进行类型检查，
         *      并在运行时使用原生类型。
         *      这样可以在编码时增强类型安全性，并在运行时减少转换和强制类型转换的需要。
         *
         * 可以直接声明一个泛型数组，减少 数据的类型转换
         * ArrayList<String> a = new ArrayList<String>();
         *
         *
         * 类型存在 多态的使用
         * 泛型没有 多态
         */
        ArrayList a = new ArrayList();
        a.add(new User46());

//        Object o = a.get(0);        // 多态限制 对象使用 场景
//        o.test();
//        a.get(0).test();              // test 无法使用

        // 如要使用 自己的方法 需要强制类型
        // 从 Object 转到 自己
        // 条件: 声明的对象的类型 必须要与 转换的类型 有继承（子继父）关系，
        //      或者 从 Object父类型 转到 自己对应的类型
        ((User46)a.get(0)).test();      // 是用什么方法 看对象
        // 当 User46 是 User46_ 的子类时，不会报错
        ((User46_)a.get(0)).test();

        // 上面是从 子类转到 父类，
        // 这里从 父类强制转换到子类 是不行
//        a.add(new User46_());
//        ((User46)a.get(1)).test();


    }
}
class User46 extends User46_{
    void test(){
        System.out.println("哈哈哈哈......");
    }
}

class User46_{
    void test(){
        System.out.println("嘻嘻系系.......");
    }

}