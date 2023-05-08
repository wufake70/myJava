public class java041_common_object_deal_Exception {
    public static void main(String[] args){
        /**
         *
         * 处理异常 使程序 更加 健壮些
         * 异常处理语法:
         * try{
         *     ...code...
         * }catch(){        需要 Throwable类的 形参
         *     ...code...
         * }catch(){
         *     ...code...
         * }finally{
         *     ...code...
         * }
         *
         */
        int b = 0;
    try{
        b = 10/b;
    }catch(ArithmeticException e){
//    }catch(RuntimeException e){  属于是 运行期异常
        System.out.println("报错的内容: " + e);
        System.out.println("正常运行....");

    }



    }
}
