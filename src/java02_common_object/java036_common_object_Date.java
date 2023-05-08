import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class java036_common_object_Date {
    public static void main(String[] args) throws ParseException {

        /**
         * 日期类:
         *
         * Date类
         * Calendar类
         */

        // 打印时间戳
        System.out.println(System.currentTimeMillis());


        Date a = new Date();        // java.util.Date
        System.out.println(a);
        // 日期格式类，        java.text.SimpleDateFormat
        SimpleDateFormat Df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /**
         * y    (Y) ---> 年 ----》 yyyy
         * m    (M) mm 分钟，MM 月份
         * d    (D) dd 一个月的日期，D 一年中的日期
         * h    (H) h 12 进制， H 24进制
         * s    (S) s 秒， S 毫秒
         */
        // 打印 格式化后(日期 ====》 字符串)
        System.out.println(Df.format(a));
        // 字符串 ===》 日期
        String b = "2022-06-01";
        Df.applyLocalizedPattern("yyyy-MM-dd");     // 切换匹配模式
        Date c = Df.parse(b);
        System.out.println(c);
        // 根据时间戳构建指定 日期对象
        a.setTime(System.currentTimeMillis());
        // 获取时间戳
        System.out.println(a.getTime());

        // 判断两个日期(日期类对象) 的 前后
        System.out.println(c.before(a));
        System.out.println(c.after(a));


    }
}
