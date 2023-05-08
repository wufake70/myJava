import java.util.Scanner;

public class java008_process_control {
    public static void main(String[] args){
        // 流程控制: 顺序执行、分支执行、重复执行

        // 分支执行
        // if语句 "if  else-if  else"
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的名字: ");
//        String name = sc.next();
//        if (name.length() == 0) System.out.println("没有任何操作。。。。");
//        else System.out.println("你好，"+name);
//        System.out.println("请输入 1~~3 一个整数: ");
//        int n = sc.nextInt();
//        switch (n){
//            case 1:
//                System.out.println("hello world");
//                break;
//            case 2:
//                System.out.println("你好 世界");
//                break;
//            case 3:
//                System.out.println("你好 java");
//                break;
//            default:
//                System.out.println("hello hello");
//        }


        // 重复执行 循环 for、for-Each、while、do while
//        for(int i=0;i<100;i++){
//            System.out.println(i);
//        }                     // 最后 为 99
//        int i=0;
//        while (i<100){
//            i++;
//            System.out.println(i);
//        }                     // 最后 为 100
        int i=0;
        do{
            i++;
            System.out.println(i);
        }while (i<100);         // 最后为 100

        // continue、break

//        for-Each 循环 for(type i:Object)
        Object[] d = {9,99,99,"hello world"};
        for (Object ii: d) System.out.print(ii+ ", ");





    }
}
