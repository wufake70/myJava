public class java022_object_access_rights {
    public static void main(String[] args){
        /**
         * 访问权限: 访问属性、方法的权利和限制
         *
         * 访问权限修饰符
         * public:  公共的，
         *      当一个类、方法或变量被声明为public时，它可以被任何类访问
         *      java的源码中，公共类只能有一个，且名字与文件名相同
         *      main方法 是由 jvm调用的，jvm 可以任意调用。
         *      main方法中 static的作用 使main方法 为静态方法，不构造对象 也可调用
         *
         * protected: 受保护的，                       同类、同包、子类
         *       当一个类、方法或变量被声明为protected时，它可以被它所在的包和所有子类访问。
         *      子类可以使用
         *
         * default:  默认权限，jvm 提供的，也是 包权限，   同包，同类
         *      当一个类、方法或变量没有访问权限修饰符时，它默认为default访问权限。它可以被它所在的包中的类访问，但不能被其他包中的类访问。
         *      在同一个包内(同一路径下) 可以使用，包外不可以
         *
         * private:  私有的，限制高                     同类
         *      在 类中可以使用，但在类外面 就不可使用
         *
         *
         * 在java当中，所有类 都有一个父类 叫Object。
         */

        User22 a = new User22();
        // 谁(类)访问到谁(类)？？？
        // 谁访问 java022_object_access_rights类 (----super--->  java.lang.Object)
        // 访问到 (User22  ------super-----> ) java.lang.Object  这是两个 父类 对象
        // java.lang.Object 的 clone方法(protect权限)
//        a.clone();

        /**
         * 外部类 (源码中直接声明的) 只能用 public、default
         * 内部类 (在 类中的类)，内部类可以看做 外部类的属性，
         *      需要构建外部类对象 才能使用
         */
        Outclass b = new Outclass();
        // 创建 内部类对象
        Outclass.Inclass c = b.new Inclass();


        /**
         * 单例模式: 一个类只有 一个对象；
         *      问题:
         *      类的创建 复杂
         *      类的对象 消耗资源
         */
//        User23 d = new User23();  无法使用
//        User23.crate();   该方法 无法解决 上述问题，只是换了一个方法 创建对象
        User23 e = User23.crate();
        User23 f = User23.crate();
        System.out.println(e == f);

    }
}
class User22{

    void test() throws CloneNotSupportedException {
        // 该对象正确的访问方式
        clone();
    }

}
class Outclass{
    public class Inclass{

    }
}
// 单例模式
class User23{

    // 给该构造函数 添加 private权限 ，只有 同类中 才能访问
    // 此时就不能 在外面 通过 构造函数 来创建对象
    private User23(){

    }

    // 声明一个属性 来 保存 单例，首先 让他等于 空对象 null；
    // 后面在 赋值
    private static User23 user23 = null;

    // 声明一个方法，使他能创建对象
    // 必须加static 才能使用
    public static User23 crate(){

        if (user23 == null) {    // 判断是否创建过
            user23 = new User23();
            return user23;
        } else return user23;

//        return new User23(); 该方法 无法解决 上述问题，只是换了一个方法 创建对象
    }

}
