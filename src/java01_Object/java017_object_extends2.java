public class java017_object_extends2 {
    public static void main(String[] args){

        // 面向对象 继承
        // 构造方法
        // 创建子类对象前，会先 调用父类 构造方法创建 父类对象，多个子对象 就会多次调用

        // 默认情况下，子类创建时，会调用父类的构造方法，
        // 当父类 构造方法有参数时，需要在 子类构造函数中 使用super() 传参；

        Child2 a = new Child2();
        Child2 b = new Child2();
        /**
         * new: 只会构建一个对象（然后 开辟一个内存空间，保存属性），不会构建父类对象
         *
         *
         */


    }
}
class Parent2{
    String name;
    // 构造方法
    Parent2(String name){
        this.name = name;
        System.out.println("Parent....");
    }

}

class Child2 extends Parent2{
    // 构造方法
    Child2(){
        super("张三");
        System.out.println("child.....");
    }

}