import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class java030_common_object_array {
    public static void main(String[] args) {
        /**
         * Array 数组
         */
        // 声明数组
        // 格式: 类型[] 变量 = new 类型[];
        String[] a = new String[9];     // 引用数据类型默认 null

        // 索引赋值
        a[0] = "hello";
        System.out.println(a[0]);

        // 数组 的长度
        System.out.println(a.length);

        // 类似 Python for i in obj:
        // "String i" 要保证 与 a数组里的元素 类型一致
        for (String i : a) System.out.println(i);

        // 创建数组的 第二种方法
        int[] b = {1,3,6};
        String[] c = {"张三","李四","999","hello world","8888","zhangsan","王五"};

        // 可以声明 一个Object 数组,
        // 可以装入 基本数据对应 包装类对象、引用数据类型
//        Object[] d = new Object[10];
        // 可以装下 各种各样的 数据
        Object[] d = {11,true,'a',"love","张三",new User29_(),b,a,a[0]};
        for (Object i:d) System.out.print(i+", ");
        System.out.println("\n");


        System.out.println("==================转为列表=====================");
        // 将数组 转为 列表对象，获取更多操作。
        List list = Arrays.asList(c);
//        list.add("构建");  不能添加
//        System.out.println(list.remove("999"));  也不能移除
        System.out.println(list.contains("王五"));
        System.out.println(list.indexOf("王五"));
        list.set(0,"呵呵");       // 可以修改
        System.out.println(list.get(0));
        System.out.println(list);



    }
}
