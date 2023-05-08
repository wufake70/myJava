public class java026_object_enum {
    public static void main(String[] args){
        /**
         * 枚举是一个特殊的类，其中包含了一组特定的对象，
         * 这些对象不会发生改变，一般使用大写的标识符。
         *
         * 枚举类型可以用来定义一组可能出现的常量值，以防止变量被赋予不合法的值。
         *
         * 枚举使用enum关键字
         *
         * 枚举类使用将 对象放在最前面
         * 枚举类 不能创建对象，对象时在 类里面创建的
         *
         */
        System.out.println(Season.SPRING.name);
        System.out.println(Season.SUMMER.name);
        System.out.println(Season.FALL.name);
        System.out.println(Season.WINTER.name);



    }
}

enum Season {
    // 创建 枚举类对象
    SPRING("春天",1), SUMMER("夏天",2),
    FALL("秋天",3), WINTER("冬天",4);
    Season(String name,int code){
        this.name = name;
        this.code = code;

    }
    public String name;
    public int code;
}
