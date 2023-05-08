public class java020_object_overwrite {
    public static void main(String[] args){

        /**
         * 方法的重写:
         *      父类对象的方法其实主要体现通用性，无法在特殊场合使用，
         *      如果要使用该方法，就需要 重写该方法
         *
         *      重写时注意: 方法名，参数列表 都要相同。
         *
         * 一个对象能用什么方法，取决于 引用变量的类型----多态 限制 对象
         * 一个对象能用什么属性，取决于 引用变量的类型----多态 限制 对象
         * 一个对象的方法的具体使用 取决于 对象 ---- 该方法可能 重写了
         * 一个对象的属性的具体使用 不取决于 对象，在哪就在那里使用
         */

        Child3 a = new Child3();

        Parent3 b = new Child3();   // b可以使用 sum、getI 方法，
                                    // 因为 父类也有该方法(父类方法被重写)
//        b.sum();        // 打印 40
        // 注释掉 子类中 sum方法(没有重写)
//        b.sum();        // 打印 20
        // 将 父类中 sum 函数中 i 替换 为 getI
        b.sum();          // 打印 30


    }
}

class Parent3{
    void test(){
        System.out.println("parent");
    }

    int i = 10;

    void sum(){
//        System.out.println(i+10); // 属性具体使用 就看在哪里声明的
        System.out.println(getI()+10);  // 方法的具体使用 就取决于对象是谁
                                        // getI 的调用 对象是 b 子对象

    }
    int getI(){
        return i;
    }

}

class Child3 extends Parent3{

    void test(){        // 方法的重写
//        super.test();
        System.out.println("child");
    }

    int i = 20;     // 属性在哪里声明，就在那里使用
//    void sum(){      // 方法重写
//        System.out.println(i+20);
//    }
    int getI(){     // 方法重写
        return i;   // 属性具体使用 就看在哪里声明的
    }
}





