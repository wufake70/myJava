public class java021_object_recursion {
    public static void main(String[] args){

        // recursion 递归调用
        // 在函数 内调用自身

        // 求20以内的奇数和 使用 递归函数 解决；
        System.out.println(JiShuSum(7));

        // 递归要有 跳出的逻辑，否则 会报错 StackOverflowError 堆栈溢出错误

    }
    public static int JiShuSum(int a){
        int sum=0;      // 声明一个变量用于保存数据
        if (a == 0) {}
        else {
            if (a==1) sum += 1;
            else if (a%2==0) sum += JiShuSum(a-1);  // 偶数情况
            else {                                      // 奇数
                sum += a;
                sum += JiShuSum(a-2);   // 递归调用
            }
        }
            return sum;
    }

}
