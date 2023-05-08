public class java040_common_object_Exception {
    public static void main(String[] args){

        /**
         * 错误
         *
         * java 中 异常分为 两大类
         *      1.可以通过代码恢复正常逻辑执行的异常，称之为 "运行期异常"
         *          RuntimeException
         *      2. 不可以通过代码恢复正常逻辑执行的异常，称之为 "编译期异常"
         *          Exception
         *
         */

        // 1.类型转换出现了错误（语法错误）
        String a = "123";
//        int a1 = (Integer) a;
        Integer a1 = Integer.parseInt(a);

        // 2.递归 没有跳出的逻辑(逻辑错误): stackoverflowerror
        fun();

    }
    // 2.递归 没有跳出的逻辑: stackoverflowerror
    public static void fun(){
        fun();

    }
}
