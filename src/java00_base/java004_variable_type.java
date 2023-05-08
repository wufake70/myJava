public class java004_variable_type {
    public static void main(String[] args){
        System.out.println(' ');
        // 比特: 数据运算 存储最小单位
        // 字节: 计算机 存储最小单位

        // 变量一旦声明 类型 就不能改变

        // java数据类型: 基本数据类型(数值、字符、布尔值)、应用数据类型
        // 数值整型类型 （4个整型、2个浮点型）
        // byte -2^7~~2^7 -128.... ,默认为0   1字节
        byte bt0, bt = 24;
        System.out.println(bt);
        // shor -2^15~~2^15 大约 -32000....  2字节
        short num1 = 32000;
        System.out.println(num1);
        // int -2^31~~  大约 21亿             4字节
        int num2 = 2100000000;
        System.out.println(num2);
        // long -2^63 大约 .......            8字节

        // 浮点类型 float(需要加上F/f 进行识别)、double(默认)
        float f1 = 9.3857733222f;       // 6位精度 4Byte
        double f2;                      // 14位精度 8Byte
        f2 = 9.9999988888888888889;
        System.out.println(f1);
        System.out.println(f2);


        // 字符型
        char c1 = 'a';
        System.out.println(c1);


        // 布尔类型
        boolean b1,b2 = true;
        b1 = false;
        System.out.println(b1);
        System.out.println(b2);




        // 应用数据类型


    }
}
