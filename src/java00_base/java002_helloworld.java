public class java002_helloworld {
    /**
     * public java修饰符 访问控制类型
     *          public      公共的
     *          private     私有的
     *          default     默认的
     *          protected   受保护的
     * static   静态
     *
     *
     * void 函数返回值类型
     *
     * main 主函数、该程序 的入口
     */

    public static void main(String[] args){
        System.out.println("hello world\n你好 世界\nhello java\n你好 java");
        System.out.println('a');
        // 强制 分号结尾
        // 双引号: 引用，上面表示 引用字符串
        // 单引号: 表示 单字符
        /*
         * 代码运行过程:
         *
         *   源代码(xxx.java)----》编译器(javac.exe)----》字节码(类文件xxx.class) ---(java.exe)-》 JVM(java虚拟机)----》os(win、mac)----》cpu----》内存/磁盘
         *                                                                      控制台输出  《----JVM      《----os（win、mac） 《----cpu 《----
         *
         *   注意:
         *       1.在idea 集成开发环境中 java源代码 只能在src文件夹下 编写
         *       2.运行java代码时 编译成 的 字节码文件 会保存在 out文件夹下
         *       3.bin目录下 java.exe 会启动 JVM(虚拟机),JVM会读取 字节码文件，在后 执行相关操作
         *
         *       4.在 cmd中 运行java代码时 可以使用 Dfile.encoding参数 指定 编码的格式
         *           java -Dfile.encoding=utf-8 java002_helloworld.java
         *
         *       5.在 cmd中 运行java代码时 对应的流程:
         *              javac -encoding 对应编码格式 xxx.java         编译成 字节码文件（.class）
         *              java xxx(只填写文件名、不要后缀名)              启动 虚拟机 执行 字节码文件
         *
         * */


    }
}



