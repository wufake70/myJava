public class java009_object_class {

    public static void main(String[] args) {
        // 类实例化 对象
        // 格式: 类名 变量名 = new 类名();
        People p1 = new People();
        p1.name = "无法可";
        p1.age = 24;
        p1.gender = "男";
        // 执行对象的方法
        p1.SayHi();
        System.out.println(p1);

    }
}
/**
 * object-oriented
 * 面向对象 就是 将具体的事务(Object)进行分析，来处理问题
 *
 * 类和对象
 * 类表示 归纳和整理，使用class 声明
 * 对象表示 具体事物，new 关键字
 *
 * 类: 结构体，包含了属性和方法
 * 可以 实例化对象
 * 格式: class 类名{ ....... }
 *
 * 实例化 对象
 * 类名 变量名 = new 变量名()
 *     在 堆空间 创建 该对象，然后 将该对象的 地址值 赋给 栈空间的变量(引用关系)
 *
 *
 * 栈: 存储 方法、变量(基本数据类型)
 *
 * 堆: 存储 对象
 *
 * 元空间: 存储 类的信息
 *
 * 特殊的对象: 没有引用的 对象(没有任何变量指向) 即为空对象(null)
 * 所有 引用类型变量 默认值 为 null
 * User a = null;
 *
 */

// 创建类
class People{
    // 特征，属性
    // 字符串 默认
    // 整型   默认值 0
    // 浮点型 默认值 0.0
    // 对象   默认值 null
    // 字符   默认值 \\u
    String name;
    int age;
    String gender;

    // 功能，方法
    void SayHi(){
        // this 是 调用该函数的 对象
        System.out.println("Hi 我是 "+this.name);
    }


}

