import java.util.ArrayList;

public class java005_type_conversion {
    public static void main(String[] args){
        // 数值类型的转换
        // 原则: 小范围的 可以 转换为 大范围，反之不行
        // byte --》 short --》 int --》 long --》 float ---》 double
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // 大 ---》 小 使用强制转换
        // 格式: (对应类型)变量名
        long aa = 100;
        byte bb = (byte) aa;
        System.out.println(bb);

        // 数值转字符串,通过字符串拼接
        String a1 = aa+"";
        System.out.println(a1);


        // char和数值类型 可以任意转换
        System.out.println((char)97.0);     // a
        System.out.println((int)'a');     // 97



        // 对象的 强制类型转换
        ArrayList a5 = new ArrayList();
        a5.add(new User46());

//        Object o = a.get(0);        // 多态限制 对象使用 场景
//        o.test();
//        a.get(0).test();              // test 无法使用

        // 如要使用 自己的方法 需要强制类型
        // 从 Object 转到 自己
        // 条件: 声明的对象的类型 必须要与 转换的类型 有继承（子继父）关系，
        //      或者 从 Object父类型 转到 自己对应的类型
        ((User46)a5.get(0)).test();      // 是用什么方法 看对象
        // 当 User46 是 User46_ 的子类时，不会报错
        ((User46_)a5.get(0)).test();

        // 上面是从 子类转到 父类，
        // 这里从 父类强制转换到子类 是不行
//        a.add(new User46_());
//        ((User46)a.get(1)).test();


        // 将 int类型转为 其对应的包装类
        int a6 = 99;
        System.out.println((Integer)a6 instanceof Integer);     // true


    }
}
