import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class java056_serialize_xuliehua {
    public static void main(String[] args) throws RuntimeException, IOException {
        /**
         * 字符串比特数组 byte[]
         *      将 String 编码成 byte数组 类型数据，                           ---- 序列化,一个对象转换为一组字节，以便在网络上传输或在磁盘上存储
         *      str.getBytes(StandardCharsets.ISO_8859_1);
         *
         *      将byte[] 解码 操作,使用 字符串的构造函数,并指定编码格式(默认utf-8)  ---- 反序列化,将一组字节 还原为一个对象
         *      String text = new String(content,StandardCharsets.UTF_8);
         */
        System.out.println("====================写入任意数据===============");
        String str = "你好世界！！";
        // 将 str 编码（utf-8）成 byte数组 类型数据
        byte[] data = str.getBytes(StandardCharsets.ISO_8859_1);

        File f1 = new File("./src/csCode/003.py");
        // 创建 输出管道
        FileOutputStream out = new FileOutputStream(f1);
        // 打开写入阀门
        out.write(data);
        // 收回管道
        out.close();
        System.out.println("写入完成...");

        System.out.println("===============读取并打印数据=================");
        // 获取文件对象
        File f2 = new File("./src/csCode/004.txt");
        // 插入读取管道
        FileInputStream in = new FileInputStream(f2);
        // 打开阀门
        byte[] content = in.readAllBytes();
        // byte[] 解码 操作,使用 字符串的构造函数,并指定编码格式
        String text = new String(content,StandardCharsets.UTF_8);
        String[] textArr = text.split("");
        System.out.println(textArr[0]);
        // 收回管道
        in.close();





    }
}
