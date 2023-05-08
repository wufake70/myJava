import java.util.Scanner;

public class java010_object_attribute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        User b = new User();

        System.out.println("请输入用户名和密码 用来注册: ");
        String account1 = sc.next(),
                password1 = sc.next();
        boolean result = b.register(account1,password1);

        if (result) {
            System.out.println("请输入用户名和密码 用来登录: ");
            String account = sc.next(),
                    password = sc.next();
            b.login(account, password);
        }
        else System.out.println("该账号未注册");


    }
}

class User{
    /**
     * 属性和变量的区别；
     *          变量作用域 只在大括号内；属性的作用域 很大
     *          变量使用前 必须声明并赋值；属性可以不赋值 有默认值；
     */

    // 属性
    private String account ,password;   // private 表示 在 该作用域外 不能 访问,安全性 高

    boolean register(String a,String b){
        account = a;
        password = b;
        return true;
    }
    void login(String a,String b){
        if ((account.equals(a))&(password.equals(b))) System.out.println(this.account+'\t'+"登录成功");
        else System.out.println("密码错误，登录失败");
    }

}