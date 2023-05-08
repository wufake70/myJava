import java.util.LinkedList;

public class java045_common_object_LinkedList {
    public static void main(String[] args){

        /**
         *
         * LinkedList (链表)
         *      LinkedList 没有索引的 概念
         *      Java 中的链表是数据元素的线性集合，称为节点，每个节点通过指针指向下一个节点。
         *      它是一种动态数据结构，可以在程序执行期间增长或收缩。
         *      与数组不同，它没有固定大小。
         *      链表中的每个节点包含两个字段：存储元素的数据字段和存储下一个节点地址的引用字段。  第一个节点称为头，最后一个节点称为尾。  链表适用于事先不知道元素数量或需要频繁插入或删除元素的情况。
         *
         *
         */

        System.out.println("============构建对象=============");
        // 构建 LinkList
        LinkedList a = new LinkedList();
        System.out.println(a);        // []

        System.out.println("============添加数据=============");
        System.out.println("============获取数据=============");
        // 增加数据
        a.add("张三");
        System.out.println(a.get(0));
        a.addFirst("李四");
        System.out.println(a.get(0));
        a.add(0,"王五");
        System.out.println(a.get(0));
//        a.add()       添加另外一个集合

        System.out.println("==============修改数据=================");
        a.set(0,"赵六");
        System.out.println(a.get(0));

        System.out.println("==============删除数据=================");
        a.remove(0);    // 返回一个布尔类型的值
        a.add("张三");
        System.out.println(a);
        a.remove("张三");     // 删除指定对象(一个)













    }
}
