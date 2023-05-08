public class java016_object_extends {
    public static void main(String[] args){
        /**
         * 面向对象 有三个重要特征: 继承、封装、多态
         * 类存在父子关系
         * 类的继承 是单继承，一个类 只有一个父类
         *
         * 语法: class 子类 extends 父类
         *
         * 如果 父类和子类 有相同的 属性，可以用super、this来区分
         * super、this 都表示对象，在静态代码块中 不可以使用
         *
         */

        Child a = new Child();
        // 直接获取 父类 属性和方法
//        System.out.println(a.name);
//        a.test();

        a.test();


    }
}

class Parent{
    String name = "张三";
    void test(){
        System.out.println("test");

    }
}
class Child extends Parent{
    String name = "李四";
    void test(){
        System.out.println(this.name);  // 子类属性
        System.out.println(super.name);  // 父类属性
    }


}


