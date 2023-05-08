import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class java052_iterator {
    public static void main(String[] args){
        /**
         *  迭代器对象
         *  Iterator
         *
         */

        HashMap<Object,Object> a = new HashMap<>();
        a.put(1,"张三");
        a.put(2,"李四");
        a.put(3,"王五");
        a.put(4,"路飞");

        Set<Object> keys = a.keySet();
         // 将 键名为 3的 键值对 删去
//        for(Object i:keys) {          // 在循环中 移除 Map任一条数据，会报错
//            if ((((Integer)3).equals(i))) a.remove(i);
//            System.out.print(a.get(i)+", ");
//        }

        // 创建一个迭代器对象
        Iterator<Object> iterator = keys.iterator();
        // hasNext 方法 用于判断是否存在下一条数据
        while (iterator.hasNext()){
            // 获取下一条数据
            Object key = iterator.next();
            // 将 键名为 3的 键值对 删去,
            if ((((Integer)3).equals(key))) iterator.remove();
            System.out.print(a.get(key)+", ");
        }
        System.out.println("\n");

        // 使用迭代器 遍历 HashMap的键值对对象
        Iterator iterator1 = a.entrySet().iterator();
        // 使用while 循环
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            System.out.println(obj);
        }





    }
}
