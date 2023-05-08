public class java006_reference_type {
    public static void main(String[] args){
        // 可以被 引用的 数据类型、字符串、类、接口、数组、枚举、特殊数据类型(null)
        String str1 = "你好世界！！！";
        System.out.println(str1);

        // 基本类型的对应类, 包装类(将基本数据类型 转换 为引用数据类型)
//        Byte a = null;
//        Short b = null;
//        Integer c = null;
//        Long d = null;
//        Float e = null;
//        Double f = null;
//        Character g = null;
//        Boolean h = null;

        // int 与 Integer 的转换过程
        int a = 10;
//        Integer b = Integer.valueOf(a);
        Integer b = a;  // 自动装箱

        // 将引用数据 转基本数据类型
//        int c = b.intValue();
        int c = b;      // 自动拆箱
    }


}
