import java.util.Date;
public class java014_object_import {
    public static void main(String[] args){
        /**
         * import 关键字
         * 在使用类的时候 一般使用全类名(包名+类名)，否则会造成歧义
         * java.lang 包名使用频繁 为了简化开发，包名 由jvm虚拟机 自动添加
         *
         * 导入其他类 (位置 package 后面，class前 )
         * import java.util.Date;       可以多次声明
         * import java.util.*           要导入多个类，可以使用 通配符 *
         *
         * 如果使用 当前包中的类 也不用 import
         *
         */

//        java.lang.String a = "99999";
        String a = "99999";     // java.lang 该包名使用频繁 为了简化开发，
                                // 他的包名 由jvm虚拟机 自动添加
    }
}
