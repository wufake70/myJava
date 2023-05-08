public class java019_fun_overload {
    public static void main(String[] args){


        /**
         * 一个类中 不能重复声明相同的方法、也不能声明相同的属性
         * 这里 相同的方法 是指 方法名相同、参数列表相同 ，但与 返回值无关
         *
         * 方法的重载: 如果方法名相同、但是参数列表(个数、顺序、类型)不相同，
         *           在 java中 会认为是不同方法
         *
         * 构造方法的重载:
         *
         * 函数的重载:
         */
        User03 a = new User03();
        a.login("wufake","88888");
        a.login(8888);
        a.login("wufake");

        System.out.println("=======================");

//        byte b = 9;
        char b = 'a';
//        test(b);        // bbb
        // 注释掉  test(byte b)

        // 传入的的参数(基本数据) 在匹配 重载的方法时，
        // 可以扩大数据的精度(8bit-->16bit)
        // byte 与 char 不能做转换
        test(b);    // sss

    }

    //方法的重载
//    static void test(byte b){
//        System.out.println("bbb");
//    }
    static void test(short s){
        System.out.println("sss");
    }
//    static void test(char c){
//        System.out.println("c");
//    }
    static void test(int i){
        System.out.println("iii");
    }

}

class User03{

    void login(String account,String password){
        System.out.println("111111");
    }

    void login(int code){
        System.out.println("222222");
    }

    void login(String wx){
        System.out.println("333333");
    }
}

