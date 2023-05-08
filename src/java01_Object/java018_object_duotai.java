import java.util.GregorianCalendar;

public class java018_object_duotai {
    public static void main(String[] args){

        /**
         * 多态: 一个类实例出来的对象 在不同场景表现出来的不同状态和形态
         * 多态语法 其实就是 对 对象的使用场景 进行了约束
         * 格式: 父类名 变量名 = new 子类名();
         */
        Person a = new Person();
        // 构造子类
        // 格式: 父类名 变量名 = new 子类名();
        Person b = new Boy();
        Person c = new Girl();
        a.testPerson();
//        b.testboy();      // 此时 子对象一些方法(被约束了) 无法使用，只能当作父类的对象来使用
//        c.testgirl();
    }
}
class Person{
    void testPerson(){
        System.out.println("test person");

    }
}
class Boy extends Person{
        void testboy(){
            System.out.println("test Boy");
        }
}
class Girl extends Person{
        void testgirl(){
            System.out.println("test Girl");
        }
}


