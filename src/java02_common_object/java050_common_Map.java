import java.util.*;

public class java050_common_Map {
    public static void main(String[] args){
        /**
         * Map(接口) 映射
         *      存储键值对 数据
         *      通过 键名 去关联 键值
         *
         *      不能重复，
         *      无序的
         *
         */

        System.out.println("==============创建=============");
        // hash+array+单向链表
        HashMap<String,String> m = new HashMap();

        System.out.println("==============添加(修改)=============");
        m.put("1","张三");        // 返回 null
        m.put("2","Lisa");
        m.put("3","李四");
        m.put("4","王五");
        System.out.println(m.put("4", "波多野结衣"));     // 键名 “4”重复，会覆盖“王五”，并返回 "王五"
        m.putIfAbsent("3","苍老师");       // 没有 就添加、有 则什么都不做
        m.replace("1","无法可");           // 有就修改，没有就不做。。。。
        System.out.println(m);

        System.out.println("================获取============");
        System.out.println(m.get("1"));     // 传入键名

        System.out.println("===============删除===========");
        System.out.println(m.remove("2"));      // 返回 删除的内容
//        System.out.println(m.remove("2","999"));      // 指定键值对 进行 删除
        System.out.println(m);

        System.out.println("==============获取所有的key==============");
        Set keyset = m.keySet();
        Collection valset = m.values();
        System.out.println(keyset);
        System.out.println(valset);

        System.out.println("==============获取键值对对象==============");
        Set<Map.Entry<String,String>> set = m.entrySet();
        System.out.println(set);

        System.out.println("===============遍历===========");
        for(Map.Entry<String,String> e:m.entrySet()) System.out.print(e.getKey()+": "+e.getValue()+", ");
        System.out.println("\n");

        System.out.println("============迭代器遍历=============");
        Iterator<String > iterator1 = m.keySet().iterator();
        while (iterator1.hasNext()){
            String str = iterator1.next();
            System.out.print("键名: "+str+",键值: "+m.get(str)+";   ");
        }



    }
}
