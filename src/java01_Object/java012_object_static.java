import jdk.dynalink.beans.StaticClass;

import java.text.BreakIterator;
import java.util.Stack;

public class java012_object_static {
    public static void main(String[] args){

        /**
         *
         * 针对于具体对象的属性 称之为 对象属性、成员属性、实例属性
         * 针对于具体对象的方法 称之为 对象方法、成员方法、实例方法
         * 以上 无法通过 类名访问
         *
         * 把和对象无关，只和类相关的称之为 静态
         * 只和类相关的属性称之为 静态属性
         * 只和类相关的方法称之为 静态方法
         * 静态语法 就是 在属性名和方法名 前 增加 static
         * 凡是 静态的，就可以通过类名 访问，成员对象也可以
         *
         *
         * 先有类 后有对象,对象也可以访问(调用) 静态属性(方法)
         * 对象方法 也可以 访问 静态属性(方法)
         *
         *
         * 静态代码块
         *      static { ...... }
         *      类的信息 在"元空间" 加载完成后，该代码快 会自动执行
         *
         * 对象准备创建时，也会自动 执行 代码块，但不是静态的
         * {
         *         System.out.println("准备创建 对象。。。。。");
         *     }
         */

        Bird.fly();
        System.out.println(Bird.type);
//        Bird.Do(); 成员方法 只通过 成员对象 调用
        Bird b = new Bird();
        b.fly();            // 先有类 后有对象,对象也可以访问(调用) 静态属性(方法)
                            // 对象方法 也可以 访问 静态属性(方法)



    }
}
class Bird{
    static {
        System.out.println("静态代码 自动执行....");
    }

    // 声明属性
    String name;        // 成员属性，与类 无关
    static String type = "鸟";   // 与对象 无关
    static void fly(){      // 只要是鸟就会飞，只和类型有关，与对象无关
        System.out.println("fly......");
    }

    void Do(){
        System.out.println("哈哈.....");
    }

    {
        System.out.println("准备创建 对象。。。。。");
    }
}