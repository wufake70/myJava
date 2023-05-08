import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class java044_common_object_ArrayList {
    public static void main(String[] args){
        /**
         * ArrayList(类似 数组)底层是 数组
         *      有序(插入顺序)，可重复
         *
         * Array 数组 阵列
         *
         */

        // 构造 ArrayList对象，可以存储 任意类型(包装类+引用数据类型)数据
        // 可以传入 长度 参数
        ArrayList a = new ArrayList(9);
        // 也可以指定存储一种类型,即声明 泛型数组
        ArrayList<String> a1 = new ArrayList<String>();
//        a1.add(''); 只能存储 字符串类型

        // add 方法 添加 任意类型数据
        System.out.println("==============添加============");
        a.add(99);
        a.add(new Object());
        a.add(null);
        a.add('a');
        a.add("hello world");
        System.out.println("==============插入============");
        a.add(0,1024);
        System.out.println(a.get(0));
        System.out.println("==============插入集合============");
        ArrayList 其他 = new ArrayList();
        其他.add(9);
        其他.add(9);
        其他.add(9);
        其他.add(9);
        a.addAll(其他);
        for(Object i: a) System.out.print(i+ ",");


        System.out.println("\n=============长度============");
        // size 方法 获取长度
        System.out.println("长度为: "+a.size());

        System.out.println("==============遍历修改============");
        // 循环遍历 集合
//        for(Object i: a) System.out.println(i);
        // 使用 get 方法 获取元素
        for(int i=0; i<a.size();i++) System.out.println("只是第"+i+"元素: "+a.get(i));

        System.out.println("==============修改============");
        // 修改元素 set 方法
        System.out.println(a.set(0, "张三"));     // 返回 old 值
        System.out.println(a.get(0));

        System.out.println("==============移除=============");
        // remove 方法 移除数据
        System.out.println(a.remove(0));        // 会返回 删除的值
        System.out.println(a.get(0));

        System.out.println("==============是否包含 是就返回索引值============");
        // indexOf 返回 索引(第一个)  lastIndexOf 最后一个索引
        System.out.println("\"hello world\" "+((a.contains("hello world"))? ("存在,其索引值为:"+a.indexOf("hello world")):"不存在"));

        System.out.println("==============清空数据并判断是否为空============");
        System.out.println("该集合是 "+(a.isEmpty()?"空的":"不是空的，开始清空...."));
        a.clear();
        System.out.println("该集合是 "+(a.isEmpty()?"空的":"不空的"));

        System.out.println("==============集合转数组============");
        a.add(99);
        a.add(new Object());
        a.add(null);
        Object[] array = a.toArray();       // 泛型(包装类+引用数据)数组
        System.out.println("\"array\" " +(array instanceof Object[]? "是数组":"不是数组" ));
        System.out.println(array);

        System.out.println("==============集合的克隆============");
        Object clone = a.clone();
        ArrayList li = (ArrayList)clone;    // 再将其转换为 集合
        System.out.println("clone :" + clone);

        System.out.println("==============集合排序================");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(9);
        num.add(29);
        num.add(95);
        num.add(92);
        num.add(229);
        num.add(1);
        System.out.println(num);
        // 需要传入一个 实现比较器接口的对象
        num.sort(new NumSort());
        System.out.println(num);


    }
}

// 将一个类 变成 接口;  比较器接口
class NumSort implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;     // 表示升序
//        return -o1 + o2;     // 表示降序
//        return 0;     // 不变
    }
}

