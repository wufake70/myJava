import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class java007_operator {
    public static void main(String[] args){
        /**
         *表达式:  运算符和数据 链接一起的指令代码
         *
         *算数运算符:
         *      一元 (一个数据)：++、--
         *      二元 (两个操作数)：+、-、*、/、%(取模、取余)
         *      三元 三木运算  boolean ? 表达式①:表达式②
         *赋值运算符: =、-=、+=、*=、/=、%=,使用该运算符 类型不会变化
         *算数表达式:
         *      这个类型是有结果的，最小数据类型为 int
         *大小(关系)运算符: ==、!=、<=、>=
         *
         *
         *逻辑运算符: |、&、!
         *      用于条件表达式
         *
         *括号优先级 最高
         *
         */
        int a = 1;
        System.out.println(a++);    // ++在后 输出数据 未改变
        System.out.println(++a);    // ++在前 输出数据 改改变 3
        System.out.println(a);

        System.out.println(1/2);    // 自动 舍弃小数部分
        System.out.println(1/2.0);  // 保留小数部分

        byte b=2,c=2;
//        int d = b + c;      // 必须为 int
        byte d = (byte)(b + c); // 可以强制转换
        System.out.println(d);

//      赋值运算符: =、-=、+=、*=、/=、%=,使用复合运算符 类型不会变化
        d+=1.9;
        System.out.println(d);      // 4


        //三目运算,不能调用函数
        System.out.println("999<1000: "+ ((999<1000)? "是的":"不是"));
        // java的输入 函数 需要 import org.w3c.dom.ls.LSOutput
        // 并实例化 Scanner类的对象，调用 nextxxx方法 即可
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int e = sc.nextInt();
        System.out.println("输入的数字为: "+(float)e);    // 支持字符串 与 数值拼接

//        逻辑运算符
        if (true | false) System.out.println("ture");
        if (true & true) System.out.println("ture");
        if (!(true & true)) {}      // 相当于 python 中pass
        else System.out.println("false");


        // == 等等于号的问题
        String str = new String("9999");    // str 是 对象地址值
        System.out.println(str == "9999");      // false，str 和 "9999" 不是同一个字符串对象，不能使用 == 进行判断
        System.out.println(str.equals("9999"));     // true


        Peo p = new Peo();
        p.a = "999";p.b = "999";
        System.out.println(p.a == p.b);         // true

        /***
         * 注意: 关系运算符 中 == 的使用
         *          运算符用于比较两个基元(数字，字符) 或 同一个对象的不同属性值(类型要相等)，看它们是否相等。
         *          然而，当与对象一起使用时，“==”运算符比较对象本身（即它们的内存地址）而不是它们的值
         *          解决方法: 使用 equals 方法
         */

    }
}
class Peo{
    String a;
    String b;
}