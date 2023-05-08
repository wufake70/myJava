import java.util.HashSet;

public class java048_common_Collection_HashSet {
    public static void main(String[] args){
        /**
         *  HashSet(Set 接口) 底层是 数组+链表
         *      数据 不能重复，
         *      数据是无序的
         *
         *  Hash:  哈希算法，散列类型
         *      添加的数据 要经过 hash算法，分配 空间
         *      相同数据 不会 存入 集合
         *
         *
         */

        System.out.println("===============创建==========");
        HashSet a = new HashSet(9);
        System.out.println("============增加============");
        a.add(9);
        a.add(9);
        a.add(90);
        a.add(99);
        a.add(93);
        System.out.println(a);

        System.out.println("=============移除并增加(即 修改)===============");
        a.remove(9);
        a.add(6666);
        System.out.println(a);
        System.out.println(a);

        System.out.println("==============只能遍历查询=================");
        for (Object i:a) System.out.print(i+", ");
        System.out.println("\n");

        // 其他的方法
//        a.size();
//        a.clear();
//        a.contains("");
//        a.toArray();
//        a.isEmpty();


        // 指定 对象的某个属性来 去除重复数据
        // 按照 对象的 id 来去重
        /**
         *  当 我们向 哈希集合 传入一个 对象时，
         *  他会将 该对象的 hashCode（内存地址）传入 哈希算法，然后分配 空间，
         *  如果 该空间 已存在 对象了，他会 判断两个对象(equals) 是不是同一个 对象，
         *  是 就直接 丢弃，不是 就会将两个值 以链表 形式存储。
         */
        // 重写 hashCode方法、equals方法
        User48 a1 = new User48(1001,"张三"),
               a2 = new User48(1001,"张三"),
               a3 = new User48(1002,"王五");
//        HashSet<User48> li = new HashSet<>();
        HashSet<Object> li = new HashSet<>();
        li.add(a1);
        li.add(a2);
        li.add(a3);
        System.out.println(li);



    }
}

class User48{
    int id;
    String name;
    User48(int a,String b){
        this.id = a;
        this.name = b;
    }

    // 重写 hashCode，通过 id 来去重
    public int hashCode(){
        return this.id;
    }
    // 重写 equals
    public boolean equals(Object obj){
        if(obj instanceof User48){  // 是不是 User48类
            User48 other = (User48)obj;
            if (other.id==this.id&(other.name==this.name)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }

}
