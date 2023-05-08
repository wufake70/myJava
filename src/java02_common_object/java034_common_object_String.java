import java.nio.charset.StandardCharsets;

public class java034_common_object_String {
    public static void main(String[] args){
        /**
         * 字符串 类(java.lang.String)
         *
         * 字符串、字符、字节的关系
         * 字符可以用字节来表示的
         *              ascii码中的字符，一个字符即一个字节，其他的 要用三个字节表示
         */

        // 构建字符串对象
        String a = "你好世界";      // java虚拟机 简化操作
        // 在Java中 使用双引号 创建 字符串对象，其实都是一个对象。
        String b = new String("你好世界");
        String c = "\"";        // 将双引号 转义
//        System.out.println(c);

        System.out.println("===================拼接=======");
        // 字符串的拼接
        // "+" 拼接,也可以与数值拼接
        System.out.println("hello "+"world");
        String d = "a" + "b";
        String e = "ab";
        // d、e 指向同一个对象
        System.out.println(d.hashCode()==e.hashCode());

        // 使用concat 进行拼接
        System.out.println(e.concat("cd"));


        System.out.println("===================比较=======");
        // 字符串的比较,equals方法
        System.out.println(e.equals("a"));
        // 忽略 字母大小写
        System.out.println("a".equalsIgnoreCase("A"));
        // -1 表示 小于；1 表示 大于；0 表示 相等； 第一个相同 会依次进行比较
        System.out.println("ca".compareTo("cb"));
        System.out.println("ca".compareToIgnoreCase("CA"));


        System.out.println("===================切割=======");
        // 字符串 切割
        String a1 = "fjakljkdfjafajkfdka";
        // 开始索引(包含)、结束索引（不包含）
        System.out.println(a1.substring(0,9));
        // 从指定的位置 截取 到最后
        System.out.println(a1.substring(0));

        System.out.println("===================分解=======");
        // 分解字符串
        // 返回 String[] 类型
        String[] li = a1.split("j");
        for(String i:li) System.out.println(i);
        // 使用三引号可以轻松地创建包含换行符、制表符和其他特殊字符的字符串，而
        // 无需使用转义字符。
        String a2 = """         
                fj;ald8724kadfjj;aklf;jd7971
                fajl;fek7871854
                """;
        // 可以传入 正则匹配参数 将所有 非数字 字符去掉
        String[] li2 = a2.split("[^\\d]+");     // +表示至少匹配一次
        for(String i:li2) System.out.println(i);

        System.out.println("===================去空格=======");
        // 字符串 trim方法，去除字符串首尾 空格
        String a3 = "  hello world   ";
        System.out.println(a3.trim());

        System.out.println("===================替换=======");
        // 字符串替换
        String a4 = "hello world";
        System.out.println(a4.replace("world", "java"));
        // 替换所有 非数字内容
        System.out.println(a2.replaceAll("[^\\d]+", "\n"));

        System.out.println("===================转大小写=======");
        // 字符串的大小写转化
        String a5 = "Hello World";
        // 全部小写
        System.out.println(a5.toLowerCase());
        // 全部大写
        System.out.println(a5.toUpperCase());

        System.out.println("===================查询=======");
        // 字符串的查找
        String a6 = "Hello world,你好";
        // charAt 可以通过索引 定位字符串
        System.out.println(a6.charAt(0));
        // indexOf 搜索传入的字符串 并返回 位置索引(第一个)
        System.out.println(a6.indexOf("l"));
        // indexOf 搜索传入的字符串 并返回 位置索引(最后一个)
        System.out.println(a6.lastIndexOf("l"));
        // 判断是否 存在
        System.out.println(a6.contains("你好"));
        // startsWith()、endsWith()
        // 判断 是否为空(不是 空格字符)
        System.out.println(" ".isEmpty());

        System.out.println("==============转为字节数组byte[]=============");
        byte[] bytes = a6.getBytes(StandardCharsets.UTF_8);
        for (byte aByte : bytes) System.out.print(aByte+", ");


    }
}
