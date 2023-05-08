public class java042_common_Exception {
    public static void main(String[] args){

        // 运行期异常

        // 空指针 异常（NullPointerException）,
        // 调用了一个 空对象(null)的成员属性和成员方法
        User a = null;
        try{
            System.out.println(a.toString());
        }catch (RuntimeException e){
            System.out.println("错误: "+e);

        }

        // 索引异常

        // ArithmeticException
        try{
            System.out.println(test(10, 0));
        }catch (Exception e){
            System.out.println(e);
        }

    }

    // 方法中可能会出现异常 那么需要 提前声明 throws关键字
    public static int test(int a,int b) throws Exception{
        try{
            return a/b;

        }catch (ArithmeticException e){
//            throw new ArithmeticException("除数为0");
            // 将异常 转换
            throw new Exception("除数为0");
        }
    }


}
